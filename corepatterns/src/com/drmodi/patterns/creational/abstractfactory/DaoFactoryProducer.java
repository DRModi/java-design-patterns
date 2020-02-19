package com.drmodi.patterns.creational.abstractfactory;

public class DaoFactoryProducer {
	
	public static DaoAbstractFactory produce(String factoryType) {
		
		DaoAbstractFactory daf = null;
		
		if(factoryType.equalsIgnoreCase("xml")) {
			daf = new XMLDaoFactory();
		}else if(factoryType.equalsIgnoreCase("db")) {
			daf = new DBDaoFactory();
		}
		
		return daf;
	}
}
