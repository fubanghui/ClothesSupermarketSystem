package com.vince.ui;

import javax.sound.midi.MidiDevice.Info;

import com.vince.utils.UserIO;

public class WelcomeClass extends BaseClass{



	public void start() {
		println(getString("info.welcome"));
		UserIO userIO=new UserIO();
		userIO.readUsers();
		boolean flag=true;;
		while(flag) {
			println(getString("info.login.reg"));
			println(getString("info.select"));
			String select=input.nextLine();
			switch(select) {
			case "1":
				new LoginClass().login();
				flag=false;
				print(getString("login.success"));
				break;
			case "2":
				
				new RegisterClass().register();
				println(getString("reg.success"));
				flag=false;
				break;
			default:
				println(getString("input.error"));
				break;
			}
		}
	}

}
