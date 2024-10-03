package com.saint.PasswortGenerator;

import com.saint.PasswortGenerator.Generator.Generator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Generator gen = new Generator(true,true,true);
        String password = gen.generatePassword(16);

        System.out.println(password);
    }
}