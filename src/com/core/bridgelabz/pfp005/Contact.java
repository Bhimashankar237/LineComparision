package com.core.bridgelabz.pfp005;

public class Contact {
    private static Contact[] allContacts = new Contact[0];
    private String name;
    private String email;
    private String city;

    public Contact(String name, String email,String city) {
        this.name = name;
        this.email = email;
        this.city = city;
        Contact[] newArray = new Contact[allContacts.length + 1];
        System.arraycopy(allContacts, 0, newArray, 0, allContacts.length);
        newArray[allContacts.length] = this;
        allContacts = newArray;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getCity() {
    	return city;
    }

    public static Contact[] getAllContacts() {
        return allContacts;
    }
}