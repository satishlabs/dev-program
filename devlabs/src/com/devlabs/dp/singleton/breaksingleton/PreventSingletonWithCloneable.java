package com.devlabs.dp.singleton.breaksingleton;

class SingletonPreventWithCloneable implements Cloneable{
	public static final SingletonPreventWithCloneable instance = new SingletonPreventWithCloneable();
	
	private SingletonPreventWithCloneable() {
		
	}
	
	public static SingletonPreventWithCloneable getInstance() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Cloning not allowed for Singleton class");
	}
	
	
}

public class PreventSingletonWithCloneable {
	public static void main(String[] args) {
		try {
			SingletonPreventWithCloneable instance1 = SingletonPreventWithCloneable.getInstance();
			SingletonPreventWithCloneable instance2 = (SingletonPreventWithCloneable) instance1.clone();
			
			System.out.println("Instance1 : "+instance1.hashCode());
			System.out.println("Instance2 : "+instance2.hashCode());
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
