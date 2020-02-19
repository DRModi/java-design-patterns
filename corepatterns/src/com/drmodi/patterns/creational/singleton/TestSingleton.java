package com.drmodi.patterns.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSingleton {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateUtil1 = DateUtil.getInstanceOfDateUtil();
		DateUtil dateUtil2 = DateUtil.getInstanceOfDateUtil();

		System.out.println(dateUtil1 == dateUtil2);

		boolean testValue;
		testValue = testSerialization();

		System.out.println("Test after serialize and Deserialize coming true : " + testValue);
	}

	private static boolean testSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateUtilWrite = DateUtil.getInstanceOfDateUtil();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				new File("/Users/omsairam/Documents/ddrive/training/temp/singleton/dateUtil.ser")));
		oos.writeObject(dateUtilWrite);

		DateUtil dateUtilRead = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				new File("/Users/omsairam/Documents/ddrive/training/temp/singleton/dateUtil.ser")));
		dateUtilRead = (DateUtil) ois.readObject();
		
		if(dateUtilRead==dateUtilWrite)
			return true;
		
		return false;
	}

}
