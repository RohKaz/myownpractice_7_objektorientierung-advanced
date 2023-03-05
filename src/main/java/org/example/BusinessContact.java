package org.example;

import java.util.List;

public class BusinessContact extends Contact {

    String companyName;
    List<Contact> contacts;

    public BusinessContact() {
    }

    public List<Contact> addContact(Contact contact) {
        contacts.add(contact);
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact removeContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                return contact;
            }
        }
        return null;
    }

    public BusinessContact(String companyName, String name) {
        super(name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
