package com.andrew.autoboxing_and_unboxing.challenge1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Peoples Bank");

        if(bank.addBranch("Lagos")) {
            System.out.println("Lagos branch created");
        }

        bank.addBranch("Lagos Branch");

        bank.addCustomer("Lagos Branch", "Andrew", 100000.50);
        bank.addCustomer("Lagos Branch", "James", 20000.00);
        bank.addCustomer("Lagos Branch", "Mike", 10000.20);
        bank.addCustomer("Lagos Branch", "Josh", 150000.90);

        bank.addBranch("Benin Branch");
        bank.addCustomer("Benin Branch", "Tim", 78000.21);
        bank.addCustomer("Benin Branch", "Drake", 230000.67);

        bank.addCustomerTransaction("Lagos Branch", "James", 10000.50);
        bank.addCustomerTransaction("Lagos Branch", "James", 5000.50);
        bank.addCustomerTransaction("Lagos Branch", "Mike", 12000.50);

        bank.listCustomers("Lagos Branch", true);
        bank.listCustomers("Benin Branch", true);

        bank.addBranch("Owerri Branch");

        if(!bank.addCustomer("Owerri Branch", "Ben", 9000.90 )) {
            System.out.println("Error Owerri Branch does not exist");
        }

        if(!bank.addBranch("Lagos Branch")) {
            System.out.println("Lagos Branch already exist");
        }

        if(!bank.addCustomerTransaction("Lagos Branch", "Jon Snow", 1500.50)) {
            System.out.println("Customer does not exist at the branch " );
        }

        if(!bank.addCustomer("Lagos Branch", "Andrew", 5500.00)) {
            System.out.println("Customer Andrew already exist");
        }

    }
}
