package com.andrew.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone andysPhone;
        andysPhone = new DeskPhone(1234567);
        andysPhone.powerOn();
        andysPhone.callPhone(1234567);
        andysPhone.answer();

        andysPhone = new MobilePhone(24680);
        andysPhone.powerOn();
        andysPhone.callPhone(24680);
        andysPhone.answer();

    }



}
