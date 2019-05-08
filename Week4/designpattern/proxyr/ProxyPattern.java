package com.bridgeit.designpattern.proxyr;

public class ProxyPattern {

	public static void main(String[] args) {
		Image image=new ProxyImage("/home/user/eclipse-workspace/DesignPattern/src/index.jpeg");
		//image will be loaded from disk
		image.display();
		//image will not be loaded from disk
		image.display();
	}
}
