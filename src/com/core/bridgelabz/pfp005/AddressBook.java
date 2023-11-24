package com.core.bridgelabz.pfp005;

public class AddressBook {
	
	    // Instance variables
	    private String bookName;
	    private Contact[] contacts;

	    // Constructor
	    public AddressBook(String bookName) {
	        this.bookName = bookName;
	        this.contacts = new Contact[0];
	    }

	    // Method to add contact to the address book
	    public void addContact(Contact contact) {
	        Contact[] newArray = new Contact[contacts.length + 1];
	        System.arraycopy(contacts, 0, newArray, 0, contacts.length);
	        newArray[contacts.length] = contact;
	        contacts = newArray;
	    }

	    public void displayContacts() {
	        System.out.println("Contacts in " + bookName + ":");
	        for (Contact contact : contacts) {
	            System.out.println("Name: " + contact.getName() + ", Email: " + contact.getEmail()+"  "
	            +"City: "+ contact.getCity());
	        }
	    }
	}


