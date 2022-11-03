package com.andrew.abstractclasses.challenge1;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        // Create s string data array to avoid typing loads of addItem instructions:
        String stringData = "Lagos Lisbon Denver Madrid Cairo Dubai Chicago Abuja Lagos";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }

}
