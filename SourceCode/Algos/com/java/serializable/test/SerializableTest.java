package com.java.serializable.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Keyboard{}

final public class SerializableTest implements Serializable {

	public Keyboard keyboard = new Keyboard();
	
	public static void main(String[] args) {
		SerializableTest ser = new SerializableTest();
		
		ser.storeIt(ser);
		

	}
	
	public static void storeIt(SerializableTest ser)
	{
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myfile.txt"));
			os.writeObject(ser);
			os.close();
			
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
