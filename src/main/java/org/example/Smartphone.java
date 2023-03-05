package org.example;

import java.util.List;

public class Smartphone implements Radio, GPS {

    private String modelName;
    private String publisherName;
    private List<Contact> contacts;

    public void startRadio() {
        System.out.println("Radio started");
    }

    public void stopRadio() {
        System.out.println("Radio stopped");
    }

    public void getPosition() {
        System.out.println("Köln");
    }

    public Smartphone() {
    }

    public Smartphone(String modelName, String publisherName, List<Contact> contacts) {
        this.modelName = modelName;
        this.publisherName = publisherName;
        this.contacts = contacts;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}

