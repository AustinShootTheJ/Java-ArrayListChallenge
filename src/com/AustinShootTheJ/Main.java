package com.AustinShootTheJ;
import java.util.Scanner;
public class Main {
	private static Contacts contacts = new Contacts();
	private static MobilePhone mobilePhone = new MobilePhone(contacts);
	private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


		// a check for the user to exit our program.
		boolean quit = false;
		// user input to select a method.
		int choice = 0;
		// initial call of our instructions.
		printInstructions();
		// while loop calls our methods according to user input.
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			// clears the scanner buffer.
			scanner.nextLine();

			switch(choice){
				case 0:
					printInstructions();
					break;

				case 1:
					mobilePhone.printContacts();
					break;

				case 2:
					addItem();
					break;

				case 3:
					modifyItem();
					break;

				case 4:
					removeItem();
					break;


				case 5:
					quit = true;
					break;

			}

		}

	}

	public static void printInstructions(){
		System.out.println("\n Press ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list contacts");
		System.out.println("\t 2 - To add a contact.");
		System.out.println("\t 3 - To modify contacts");
		System.out.println("\t 4 - To remove a contact");
		System.out.println("\t 5 - To quit the application.");
	}


	public static void addItem(){

    	System.out.println("Please enter the contact name: ");
		String name = scanner.nextLine();
		System.out.println("Please enter the contact number: ");
		String number = scanner.nextLine();
		mobilePhone.addContacts(name,number);
	}

	public static void modifyItem(){
		System.out.println("Enter contact name: ");
		String oldName = scanner.nextLine();
		System.out.println("Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact number: ");
		String newNumber = scanner.nextLine();
		mobilePhone.modifyContacts(oldName,newName,newNumber);
	}

	public static void removeItem(){
		System.out.println("Enter item name: ");
		String name = scanner.nextLine();
		mobilePhone.removeContacts(name);
	}




    }



