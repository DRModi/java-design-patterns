package com.drmodi.patterns.behavioral.command;

public class OffConcreteCommand implements Command {

	Television tv;
	
	public OffConcreteCommand(Television tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

}
