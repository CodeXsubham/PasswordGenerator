package main;

import java.util.Random;

// Java program to generate password
public class PasswordGenerator {
    public static void main(String[] args) {
        String
                upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChars = "<>,.?/}]{]+_-)(*&^%$#@!=";
        String combination = upper + lower + specialChars + num;
        int len = 6;
        char[] password = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password is: " + new String(password));
    }
}