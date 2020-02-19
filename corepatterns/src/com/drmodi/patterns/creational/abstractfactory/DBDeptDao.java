package com.drmodi.patterns.creational.abstractfactory;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("DBDeptDao: Saving Department Object to DB!");
	}

}
