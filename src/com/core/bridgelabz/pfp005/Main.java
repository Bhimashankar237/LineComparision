package com.core.bridgelabz.pfp005;

public class Main {
	public static void main(String[] args) {
        Contact contact1 = new Contact("Bhimashankar", "bhimashankaravhad@gmail.com","Pune");
        Contact contact2 = new Contact("Sumit", "sumitsakure@gmail.com","Mumbai");

        AddressBook addressBook = new AddressBook("My Address Book");

        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.displayContacts();
    }

}
