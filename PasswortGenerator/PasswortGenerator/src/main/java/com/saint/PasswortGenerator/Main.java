package com.saint.PasswortGenerator;

import com.saint.PasswortGenerator.Generator.Generator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi, these is a password generator app.");
        System.out.println("You can choose parameters of generator code.");
        System.out.println("Do you want to include symbols? (y/n)");

        Scanner sc = new Scanner(System.in);
        boolean isSymbols = sc.next().equalsIgnoreCase("y");
        System.out.println("Do you want to include chars? (y/n)");
        boolean isChars = sc.next().equalsIgnoreCase("y");
        System.out.println("Do you want to include uppercase letters? (y/n)");
        boolean isUppercase = sc.next().equalsIgnoreCase("y");
        System.out.print("Write the length of password: ");
        int length = sc.nextInt();

        Generator gen = new Generator(isSymbols,isChars,isUppercase);


        String password = gen.generatePassword(length);


//README.md
        System.out.println(password);
    }
}