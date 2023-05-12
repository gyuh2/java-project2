package com.example.javaproject2.week4.day5;

public class Hospital {
    private String name;
    private String websiteAddr;
    private Address address;  // Object Type

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.websiteAddr = websiteAddr;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }
}
