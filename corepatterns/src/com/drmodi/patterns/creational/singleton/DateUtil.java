package com.drmodi.patterns.creational.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	//serialize the class
	private static final long serialVersionUID = 1L;
	
	
	// Create private static instance of the class
	// private static DateUtil instance; //Used in Lazy Initialization
	private static volatile DateUtil instance; // Volatile due to improvisation
												// in multithreaded

	// Eager Initialization, will help if we are sure that this will be called at
	// least once.
	// private static DateUtil instance = new DateUtil();

	// Create private constructor, so object creation is not allowed
	private DateUtil() {

	}

	// Create public static method to return the instance of this class
	public static DateUtil getInstanceOfDateUtil() {

		if (instance == null) { //improvisation for multithreaded, check before synchronization 
				//because synchronized will be costly operation, since it will lock the 
				//DateUtil.class will be locked. so dont want to do all the time.

			synchronized (DateUtil.class) { // it will needed to make thread safe, so multiple
				// won't be able to create multiple object of the instance
				// Not needed if we are doing eager initialization
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}

		return instance;
	}
	
	// this method will help internally when same object are compared
	//after serialize and de-serialize, appeared same.
	protected Object readResolve() {
		return instance;
	}
	
	//Override the clone method to stop cloning of the singleton class
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();		
	}

}
