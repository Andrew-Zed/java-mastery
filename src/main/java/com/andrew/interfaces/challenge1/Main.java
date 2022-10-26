package com.andrew.interfaces.challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player andrew = new Player("Andrew", 10, 15);
        System.out.println(andrew);
        saveObject(andrew);

        andrew.setHitPoints(8);
        System.out.println(andrew);
        andrew.setWeapon("Stormbringer");
        saveObject(andrew);
//        loadObject(andrew);
        System.out.println(andrew);

        ISaveable werewolf = new Monster("werewolf", 20, 40);
        System.out.println("Strength >>>>> " + ((Monster)werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                                        "1 - to enter a string\n " +
                                        "0 - to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }

    }

    static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




}
