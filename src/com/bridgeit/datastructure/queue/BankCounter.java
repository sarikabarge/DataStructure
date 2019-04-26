package com.bridgeit.datastructure.queue;

import com.Utilpack.Utility;

/****************************************************************************************************
 * 	@purpose      :  To add people to queue to withdraw or deposit money and remove them from queue
 *  
 *  @author       : sarika barge
 *  @version      : 1.0
 *  @since        : 22-04-2019
 ******************************************************************************************************/

public class BankCounter {
	public static void main(String[] args) {
		int amount = 10000;
		int chocie;
		System.out.println("Enter How many People are in Queue");
		int people = Utility.getInteger();
		Queue queue = new Queue(people);
		for (int i = 0; i < people; i++) {
			System.out.println("enter person " + i + " name");
			final String NAME = Utility.getString();
			queue.enQueue(NAME);// calling enQueue method to add name of person to q object
		}
		System.out.println("Queue is ");
		queue.show();
		for (int i = 0; i < people; i++) {
			System.out.println("wELLcOME TO My BaNk");
			System.out.println("Person " + i + " in queue");
			System.out.println("Enter 1.to Width draw amount");
			System.out.println("Enter 2.to Deposit Money");
			chocie = Utility.getnumber();
			switch (chocie) {
			case 1:
				System.out.println("Enter amount TO WithDraw");
				final int withdraw_amount = Utility.getInteger();
				if (withdraw_amount > 0 && withdraw_amount <= amount) {
					amount = amount - withdraw_amount;
					System.out.println("ThankYou ..");
					if (amount == 0) {
						System.err.println("Out OF cash...!");
						return;
					}
					System.out.println(" updated amount = " + amount);

				} else {
					System.err.println("Enter Valid amount");
				}

				break;
			case 2:
				System.out.println("enter amount you want to deposit");
				final int withdraw= Utility.getnumber();// calling scanint method to take deposit amount from user
				if (withdraw > 0) {
					amount = amount + withdraw;// updating bank amount
					System.out.println(" updated amount = " + amount);

					break;
				} else {
					System.err.println("please enter valid amount");
					return;
				}
			default:
				System.err.println("Enter valid InPut");
				break;
			}

			queue.deQueue(); // calling deQueue method to remove the person from queue after their operation
			if(!queue.isEmpty())
			{
			System.out.print("current queue is ");
			}
			queue.show();
		}
	}

}
