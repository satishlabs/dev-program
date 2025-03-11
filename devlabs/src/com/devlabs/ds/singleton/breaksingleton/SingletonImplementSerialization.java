package com.devlabs.ds.singleton.breaksingleton;

import java.io.Serializable;

public class SingletonImplementSerialization implements Serializable{
	private static final SingletonImplementSerialization instance = new SingletonImplementSerialization();
	
	private SingletonImplementSerialization() {
		
	}
	
	public static SingletonImplementSerialization getInstance() {
		return instance;
	}
}
