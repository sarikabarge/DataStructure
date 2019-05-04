package com.bridgeit.addressbook.service;


import java.util.Scanner;

import com.Utilpack.Utility;

public class AddressBookManager 
{
	static AddressBook addressBook = new AddressBook();
	
	public static void addnewCustomerBook() {
		String response = null;
		if (addressBook.getFile() != null) {

			System.out.println("\nAn existing AddressBook is already opened!"
					+ "\n Do you really wish to exit? \n (reply with 'yes' or 'no'): ");
			response = Utility.getString().toLowerCase();

		}
		if (addressBook.getFile() == null || response.equals("yes")) {
			addressBook.createAddressBook();
		} else if (response.equals("no")) {
			System.out.println("\nThank you! continue with existing file... \n");

		} else {
			System.out.println("\ninvalid response!\n");
		}
	}
	public static void addPersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("Enter the first name:");
			String firstName =Utility.getString().toUpperCase();
			System.out.println("Enter the last name:");
			String lastName = Utility.getString().toUpperCase();
			System.out.println("enter the address:");
			String address = Utility.getString().toUpperCase();
			System.out.println("enter the city:");
			String city = Utility.getString().toUpperCase();
			System.out.println("Enter the state:");
			String state = Utility.getString().toUpperCase();
			System.out.println("Enter the zip");
			String zip = Utility.getString();
			System.out.println("Enter the Phone");
			String phone = Utility.getString();

			addressBook.addPerson(firstName, lastName, address, city, state, zip, phone);
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void updatePersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("search person by first name: ");
			String searchName = Utility.getString().toUpperCase();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if (index >= 0) {
				System.out.println("enter the address:");
				String address = Utility.getString().toUpperCase();
				System.out.println("enter the city");
				String city = Utility.getString().toUpperCase();
				System.out.println("enter the State:");
				String state = Utility.getString().toUpperCase();
				System.out.println("Enter the zip:");
				String zip = Utility.getString();
				System.out.println("enter the phone:");
				String phone = Utility.getString();

				addressBook.updatePerson(index, address, city, state, zip, phone);
			} else {
				System.out.println("\nPerson not found!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void removePersonInAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("Enter Name To Remove");
			String searchName = Utility.getString();
			int index = addressBook.searchPersonbyFirstName(searchName);
			if (index >= 0) {
				addressBook.removePerson(index);

			} else {
				System.out.println("\nPerson not Found!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

	public static void sortAddressBookByName() {
		if (addressBook.getFile() != null) {
			addressBook.sortByPersonName();
		} else {
			System.out.println("\\n No Address Book linked! Create one or open existing..\\n");
		}
	}

	public static void sortAddressBookByzipCode() {
		if (addressBook.getFile() != null) {
			addressBook.sortByzip();
		} else {
			System.out.println("\\nNo Address Book linked! Create one or open existing..\\n");
		}

	}

	public static void printAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			System.out.println("\n " + "File Name: "+ addressBook.getFileName() + " \n");
			addressBook.printAll();
			System.out.println(" End of this AddressBook \n" );
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}
	
	public static void saveAddressBook()
	{
		if(addressBook.getFile() != null)
		{
			IAddress.saveFile(addressBook.getFile());
			System.out.println("\nAddressBook Saved Successfully!\n");
		}
		else
		{
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}	
	}
	
	public static void saveAsAnotherAddressBook() {
		if (addressBook.getFile() != null) {
			System.out.println("enter the file name: ");
			String fileName = Utility.getString();
			System.out.println("enter the file extension: ");
			String fileExt = Utility.getString();
			if (fileExt.equals(".json") || fileExt.equals(".txt")) {
				IAddress.saveFile(FileSystem.createNewFile(fileName, fileExt));
				System.out.println("\nAddressBook Saved to another file successfully!\n");
			}
		} else {
			System.out.println("\nNo Address Book linked! Create one or open existing..\n");
		}
	}

}
