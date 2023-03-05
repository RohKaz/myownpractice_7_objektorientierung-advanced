package org.example;

public abstract class Contact {

    String name;

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

}
