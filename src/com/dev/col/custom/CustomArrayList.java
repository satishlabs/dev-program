package com.dev.col.custom;

import java.util.Arrays;

public class CustomArrayList<E> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * method adds elements in CustomArrayList.
     */
    public void add( E e){
        if(size == elements.length){
            newCapacity();
        }
        elements[size++]=e;
    }

    /**
     * method increases capacity of list by making it double.
     */
    private void newCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements,newCapacity);
    }

    /**
     * method returns removedElement on specific index.
     * else it throws IndexOutOfBoundException if index is negative or greater than size of size.
     */
    public Object remove(int index){
        if(index < 0 || index >= size){
            //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: "+index+", size: "+size);
        }
        Object removeElement = elements[index];
        for(int i=index; i<size; i++){
            elements[i] = elements[i+1];
        }
        size--; //reduce size of CustomArrayList after removal of element.
        return removeElement;
    }

    public E get(int index){
        if(index < 0 || index >= size){
            //if index is negative or greater than size of size, we throw Exception.
            throw new IndexOutOfBoundsException("Index: "+index+", size: "+size);
        }
        return (E) elements[index];//return value on index.
    }

    public void display(){
        for(int i=0; i<size; i++){
            System.out.print(elements[i]+", ");
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for(int i=0; i< size; i++){
            sb.append(elements[i]);
            if(i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> al = new CustomArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.display();
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        System.out.println(al.get(1));
    }

}
