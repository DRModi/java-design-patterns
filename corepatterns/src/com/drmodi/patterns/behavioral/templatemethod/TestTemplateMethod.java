package com.drmodi.patterns.behavioral.templatemethod;

public class TestTemplateMethod {

	public static void main(String[] args) {
		
		
		DataRenderer renderer = new XMLDataRenderer();
		renderer.dataRender();
		
		
		DataRenderer renderer1 = new CSVDataRendere();
		renderer1.dataRender();
	}


	
	

}
