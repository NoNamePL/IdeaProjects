package com.saint.PasswortGenerator.Generator;

import java.util.Random;

public class Generator {

    private boolean isSymbols;
    private boolean isChars;
    private boolean isUppercase;
    final private String symbols = ".,:;!?'\"#$%&@()[]{}*^№+-_=/<>`|";
    final private String numbers = "0123456789";
    final private String chars = "abcdefghijklmnopqrstuvwxyz";
    final private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Generator(boolean isSymbols, boolean isChars, boolean isUppercase) {
        this.isSymbols = isSymbols;
        this.isChars = isChars;
        this.isUppercase = isUppercase;
    }

    public String generatePassword(int length) {
        // TODO Implement password generation logic here

        // if there's all additions
        if(isSymbols&&isChars&&isUppercase) {
            return allAdditionalParameters(length);
        }

        if(isSymbols&&isChars) {
            return symbolsAndChars(length);
        }

        if(isChars&&isUppercase) {
            return charsAndUppercase(length);
        }

        if(isSymbols) {
            return numbersAndSymbols(length);
        }

        if(isChars) {
            return numbersAndChars(length);
        }

        if(isUppercase) {
            return numbersAndUppercase(length);
        }

        return onlyNumbers(length);
    }

    private String numbersAndUppercase(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i < length; i++) {

            switch (rand.nextInt(2)) {
                case 0:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 1:
                    sb.append(uppercase.charAt(rand.nextInt(uppercase.length())));
                    break;
            }
        }

        return sb.toString();
    }

    private String numbersAndChars(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i < length; i++) {

            switch (rand.nextInt(2)) {
                case 0:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 1:
                    sb.append(chars.charAt(rand.nextInt(chars.length())));
                    break;
            }
        }

        return sb.toString();
    }

    private String numbersAndSymbols(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i < length; i++) {

            switch (rand.nextInt(2)) {
                case 0:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 1:
                    sb.append(symbols.charAt(rand.nextInt(symbols.length())));
                    break;
            }
        }

        return sb.toString();
    }

    private String onlyNumbers(int length){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length;i++) {
            // TODO Add logic to generate random number between 0 and 9
            // and append it to the password string
            sb.append(numbers.charAt(rand.nextInt(numbers.length())));
        }
        return sb.toString();
    }

    private String charsAndUppercase(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    sb.append(chars.charAt(rand.nextInt(chars.length())));
                    break;
                case 1:
                    sb.append(uppercase.charAt(rand.nextInt(uppercase.length())));
                    break;
                case 2:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
            }
        }
        return sb.toString();
    }

    private String symbolsAndChars(int length) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            switch (rand.nextInt(3)) {
                case 0:
                    sb.append(symbols.charAt(rand.nextInt(symbols.length())));
                    break;
                case 1:
                    sb.append(chars.charAt(rand.nextInt(chars.length())));
                    break;
                case 2:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
            }
        }
        return sb.toString();
    }

    private String allAdditionalParameters(int length){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            switch (rand.nextInt(4)) {
                case 0:
                    sb.append(numbers.charAt(rand.nextInt(numbers.length())));
                    break;
                case 1:
                    sb.append(symbols.charAt(rand.nextInt(symbols.length())));
                    break;
                case 2:
                    sb.append(uppercase.charAt(rand.nextInt(uppercase.length())));
                    break;
                case 3:
                    sb.append(chars.charAt(rand.nextInt(chars.length())));
                    break;
            }
        }
        return sb.toString();
    }
}
