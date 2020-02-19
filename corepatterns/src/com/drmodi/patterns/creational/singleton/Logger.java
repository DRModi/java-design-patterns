package com.drmodi.patterns.creational.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	
	
	private static volatile Logger instance;
	
	private Logger() {
		
	}
	
	public static Logger getLogger() {
	
		if(instance==null) {
			synchronized (Logger.class) {
				if(instance==null) {
					instance = new Logger();
				}
			}
			
		}
		return instance;
		
	}
	
	
	protected static void log(String loggedMessage) {
		System.out.println("Log Statement: "+loggedMessage);
	}
	
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	

}
