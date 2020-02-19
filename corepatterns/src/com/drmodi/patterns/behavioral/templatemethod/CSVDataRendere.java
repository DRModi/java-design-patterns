package com.drmodi.patterns.behavioral.templatemethod;

public class CSVDataRendere extends DataRenderer {

	@Override
	public String readData() {
		return "read CSV - data";
	}

	@Override
	public String processData(String data) {
		return "CSVDataRenderer:Processed: "+data;
	}

}
