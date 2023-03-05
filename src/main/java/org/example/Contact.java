package org.example;

public abstract class Contact {

    String name;
    int index;

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

}
