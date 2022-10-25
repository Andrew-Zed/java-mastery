package com.andrew.linkedList.demo;

import com.andrew.linkedList.demo.Customer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Andy", 59.65);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.45);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> inList = new ArrayList<>();

        inList.add(1);
        inList.add(3);
        inList.add(4);

        for(int i = 0; i<inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }

        inList.add(1, 2);

        System.out.println("==================");

        for(int i = 0; i<inList.size(); i++) {
            System.out.println(i + ": " + inList.get(i));
        }
    }
}
