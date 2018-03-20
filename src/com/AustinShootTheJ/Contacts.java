package com.AustinShootTheJ;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private String number;
    private ArrayList<String> contactNames = new ArrayList<String>();
    private ArrayList<String> contactNumbers = new ArrayList<String>();


    // function to add to the lists.
    public void addContact(String name, String number){
        this.contactNames.add(name);
        this.contactNumbers.add(number);
    }



    // function to print out the contact lists.
    public void printContacts(){
        System.out.println("You have " + contactNames.size() + " contacts!");
        for(int i = 0; i < contactNames.size(); i++){
            System.out.println(i+1 + ". " + contactNames.get(i));
            System.out.println(contactNumbers.get(i)+ "\n");
        }
    }


    public void modifyContacts(String currentItem, String newItem, String newNumber){
        int position = findItem(currentItem);
        if(position >=0){
           modifyContacts(position,newItem,newNumber);
        }

    }

    private void modifyContacts(int position, String newItem, String newNumber){
        contactNames.set(position,newItem);
        contactNumbers.set(position,newNumber);
        System.out.println("Contact " + (position + 1) + " has been updated");
    }

    public void removeContacts(String name){
        int position = findItem(name);
        if(position >= 0){
            removeContacts(position);
        }
    }
    private void removeContacts(int position){
        contactNames.remove(position);
        contactNumbers.remove(position);
    }




    private int findItem(String searchItem){
        return contactNames.indexOf(searchItem);
    }


}
