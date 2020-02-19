package com.drmodi.patterns.creational.abstractfactory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("XMLDeptDao: Saving Department Object to XML!");
	}

}
