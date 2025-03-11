package com.devlabs.ds.singleton.breaksingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationBreakSingleton1{
	public static void main(String[] args) throws Exception {
		SingletonImplementSerialization instance1 = SingletonImplementSerialization.getInstance();
		
		//Serialization Singleton
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\dev-labs\\dev-program\\devlabs\\src\\com\\devlabs\\ds\\singleton.ser"));
		oos.writeObject(instance1);
		oos.close();
		
		//DeSerialization Singleton
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\\\dev-labs\\\\dev-program\\\\devlabs\\\\src\\\\com\\\\devlabs\\\\ds\\\\singleton.ser"));
		SingletonImplementSerialization instance2 = (SingletonImplementSerialization) ois.readObject();
		ois.close();
		
		System.out.println("Instance 1: "+instance1.hashCode());
		System.out.println("Instance 2: "+instance2.hashCode()); //Different hashcode
		
		//Instance 1: 1343441044
		//Instance 2: 204349222
	}
}
