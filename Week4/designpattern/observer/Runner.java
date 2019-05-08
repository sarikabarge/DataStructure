package com.bridgeit.designpattern.observer;
public class Runner {
	public static void main(String a[]) {
	Subscriber subscriber1 = new Subscriber(); // object of Subscriber class
	subscriber1.setCustomername("Sarika");// set customer name
	Subscriber subscriber2 = new Subscriber();
	subscriber2.setCustomername("pooja");

	MyTopic topic = new MyTopic(); // object of MyTopic class
	topic.setProductname("Redmi note 5");// set product name
	topic.setAvailable(false);

	topic.registeredObserver(subscriber1);
	topic.registeredObserver(subscriber2);
	topic.setAvailable(true);
}
}