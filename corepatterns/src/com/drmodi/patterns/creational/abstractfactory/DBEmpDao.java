package com.drmodi.patterns.creational.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("DBEmpDao: Saving Employee Object to DB!");
	}

}
