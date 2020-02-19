package com.drmodi.patterns.behavioral.command;

public class PersonClient {
	
	public static void main(String[] args) {
		
		Television tv = new Television();
		
		RemoteControl rm = new RemoteControl();
		
		OnConcreteCommand tvOnCommand = new OnConcreteCommand(tv);
		rm.setCommand(tvOnCommand);
		rm.pressButton();
		
		OffConcreteCommand tvOffCommand = new OffConcreteCommand(tv);
		rm.setCommand(tvOffCommand);
		rm.pressButton();
	}

}
