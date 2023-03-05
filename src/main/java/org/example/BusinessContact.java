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
