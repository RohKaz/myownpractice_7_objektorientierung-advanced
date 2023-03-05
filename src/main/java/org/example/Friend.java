package org.example;

public class Friend extends Contact {

    int phoneNumber;

    public Friend() {
    }

    public Friend(int phoneNumber, String name) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
