package com.devlabs.ds.singleton.breaksingleton;

class SingletonWithCloneable implements Cloneable {
	private static final SingletonWithCloneable instance = new SingletonWithCloneable();

	private SingletonWithCloneable() {
		// Private constructor prevents instantiation from other classes
	}

	public static SingletonWithCloneable getInstance() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Creates a new instance
	}
}

public class CloneableBreakSingleton1 {
	public static void main(String[] args) {
		try {
			SingletonWithCloneable instance1 = SingletonWithCloneable.getInstance();
			SingletonWithCloneable instance2 = (SingletonWithCloneable) instance1.clone();
			
			
			System.out.println("Instance1 : "+instance1.hashCode());
			System.out.println("Instance2 : "+instance2.hashCode());
			
			//Instance1 : 1225358173
			//Instance2 : 780237624
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
