package com.andrew.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    static Map<String, String> phonebook = new HashMap<>();
//
//    public Main(Map<String, String> phonebook) {
//        this.phonebook = phonebook;
//    }

    public static void main(String[] args) {

        phonebook.put("Ali", "Ndume");
        phonebook.put("Bash", "Ali");
        phonebook.put("Jon", "Jones");
        phonebook.put("John", "Legend");
        phonebook.put("Alicia", "Keys");
        phonebook.put("Tom", "Bradley");
        phonebook.put("Thomas", "Jefferson");
        phonebook.put("Oliver", "Kween");
        phonebook.put("Wesley", "Ford");

        System.out.println(phonebook.get("Tom"));

        System.out.println(phonebook);

        System.out.println("Printing everything ===================");

//        Set<String> keys = phonebook.keySet();

        for (String i : phonebook.keySet()) {
            System.out.println(i + " : " + phonebook.get(i));
        }

        System.out.println("              ");

        //using a map entry

        Set<Map.Entry<String, String>> values = phonebook.entrySet();

        for (Map.Entry<String, String>  e :  values ) {

            System.out.println(e.getKey() + " : " + e.getValue());
            e.setValue("III");
        }

    }
}
