package com.devlabs.ds.singleton.breaksingleton;

import java.io.Serializable;

public class SingletonPreventSerializationWithReadResolve implements Serializable{
	private static final SingletonPreventSerializationWithReadResolve instance = new SingletonPreventSerializationWithReadResolve();
	
	private SingletonPreventSerializationWithReadResolve() {
		
	}
	
	public static SingletonPreventSerializationWithReadResolve getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
