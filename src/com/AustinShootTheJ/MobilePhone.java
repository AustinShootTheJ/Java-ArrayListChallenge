package com.AustinShootTheJ;

public class MobilePhone {
    Contacts contacts = new Contacts();

    public MobilePhone(Contacts contacts){
        this.contacts = contacts;
    }

    public void addContacts(String name, String number){
        this.contacts.addContact(name, number);
    }

    public void removeContacts(String name){
        this.contacts.removeContacts(name);
    }

    public void printContacts(){
        this.contacts.printContacts();
    }

    public void modifyContacts(String currentItem, String newItem, String newNumber){
        this.contacts.modifyContacts(currentItem, newItem, newNumber);
    }

}
