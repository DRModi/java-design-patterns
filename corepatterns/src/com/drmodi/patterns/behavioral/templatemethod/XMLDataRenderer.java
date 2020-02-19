package com.drmodi.patterns.behavioral.templatemethod;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "read xml - data";
	}

	@Override
	public String processData(String data) {
		return "XMLDataRenderer:Processed: "+data;
	}

}
