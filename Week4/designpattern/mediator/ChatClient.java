package com.bridgeit.designpattern.mediator;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "sarika");
		User user2 = new UserImpl(mediator, "priya");
		User user3 = new UserImpl(mediator, "nilam");
		User user4 = new UserImpl(mediator, "pooja");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}

}