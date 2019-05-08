package com.bridgeit.designpattern.observer;


public interface Subject {
	public void registeredObserver(Observer observer);

	public void notifyObserver();
}