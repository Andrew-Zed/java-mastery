package com.andrew.linkedList.challenge1;

import java.util.Objects;

public class Emeka {
    public static void main(String[] args) {
//        System.out.println(new Emeka().test(null));
        System.out.println(new Emeka().test2(null));
    }

        public  boolean test(String s) {
//            String s = null;
            if (Objects.equals(s, "null")) {
                System.out.println("here");
                return true;
            } else {
                System.out.println("Not here");
                return  false;
            }
                 }

                 public  boolean test2 (String s) {
        if(s.equals("null")) {
            return true;
        } else return false;
                 }
}
