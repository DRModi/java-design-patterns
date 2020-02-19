package com.drmodi.patterns.creational.abstractfactory;

public class TestAbstractFactory {
	
	public static void main(String[] args) {
		
	DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
	Dao dao = daf.createDao("dept");
	dao.save();
	}

}
