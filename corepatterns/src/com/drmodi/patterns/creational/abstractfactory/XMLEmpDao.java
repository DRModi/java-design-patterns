

package com.drmodi.patterns.creational.abstractfactory;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("XMLEmpDap : Saving Employee object to XML");
	}

}
