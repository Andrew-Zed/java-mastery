package com.andrew.linkedList.demo;

class Customer {
    private String name;
    private double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}
