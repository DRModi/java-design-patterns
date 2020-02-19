package com.drmodi.patterns.behavioral.command;

public class OnConcreteCommand implements Command {

	Television tv;
	
	public OnConcreteCommand(Television tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.on();
	}

}
