package com.andrew.abstractclasses.lesson;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bingo");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Nigerian parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}
