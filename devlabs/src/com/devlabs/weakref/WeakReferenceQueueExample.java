package com.devlabs.weakref;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceQueueExample {
	public static void main(String[] args) {
		ReferenceQueue<Demo> refQueue = new ReferenceQueue<Demo>();
		WeakReference<Demo> weakRef = new WeakReference<Demo>(new Demo("Test"),refQueue);
		
		System.gc();
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Is object in queue? "+(refQueue.poll() != null)); //True if GC collected the object
	}
}
