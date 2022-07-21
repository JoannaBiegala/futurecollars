package com.futurecollars.lesson14.task1;

public class Contact {

    private final String name;
    private final String address;
    private String phoneNumber;


    public Contact(String name, String address, String phoneNumber) {
        this(name, address);
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
