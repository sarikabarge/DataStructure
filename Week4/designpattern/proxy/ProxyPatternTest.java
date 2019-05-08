package com.bridgeit.designpattern.proxy;

import com.bridgeit.designpattern.proxy.CommandExecutor;
import com.bridgeit.designpattern.proxy.CommandExecutorProxy;

public class ProxyPatternTest {

	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("Pooja", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}

}