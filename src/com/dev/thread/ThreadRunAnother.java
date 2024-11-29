package com.dev.thread;

public class ThreadRunAnother {
    private static final Object lock = new Object();
    private static int num = 1;
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for(int i=0; i<12; i++){
                synchronized (lock){
                    while (num != 1){
                        try {
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A");
                    num = 2;
                    lock.notifyAll();
                }
            }
        });
        Thread t2 = new Thread(() ->{
           for(int i=0; i<12; i++){
              synchronized (lock){
                  while(num != 2){
                      try {
                          lock.wait();
                      }catch (InterruptedException e){
                          e.printStackTrace();
                      }
                  }
                  System.out.println("B");
                  num = 3;
                  lock.notifyAll();
              }
           }
        });

        Thread t3 = new Thread(() ->{
            for(int i=0; i<12; i++){
                synchronized (lock){
                    while(num != 3){
                        try {
                            lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    num = 1;
                    lock.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
