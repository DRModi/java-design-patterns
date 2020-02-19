package com.drmodi.patterns.behavioral.templatemethod;

public abstract class DataRenderer {
	
	public void dataRender() {
		String data = readData();
		String processedData = processData(data);
		System.out.println("Processed - "+ processedData);
	}
	
	public abstract String readData();
	
	public abstract String processData(String data);

}
