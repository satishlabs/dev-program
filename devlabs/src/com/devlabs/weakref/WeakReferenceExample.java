package com.devlabs.weakref;

import java.lang.ref.WeakReference;

class Demo{
	String messgae;
	
	Demo(String message){
		this.messgae = message;
	}
}
public class WeakReferenceExample {
	public static void main(String[] args) {
		Demo demo = new Demo("Weak Reference Example");
		
		//Create a weak reference to the Demo object
		WeakReference<Demo> weakRef = new WeakReference<Demo>(demo);
		
		System.out.println("Before GC: "+weakRef.get()); //Object is still available
		
		//Removing strong reference
		demo = null;
		
		//Suggest garbage collection
		System.gc();
		
		try {
			//Wait to let GC run (not guaranteed)
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After GC: "+weakRef.get()); //Might be null if GC collected it
	}
}
