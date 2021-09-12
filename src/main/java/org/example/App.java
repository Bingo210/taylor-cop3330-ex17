/*
 * UCF COP3330 Fall 2021 Assignment 17 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        double r = 0;

        System.out.println( "Only numeric answers are allowed." );
        System.out.println( "Enter 1 if you are male or 2 if you are female: " );
        int gender = input.nextInt();
        System.out.println( "How many ounces of alcohol did you have?" );
        int A = input.nextInt();
        System.out.println( "What is your weight, in pounds?" );
        int W = input.nextInt();
        System.out.println( "How many hours has it been since your last drink?" );
        int H = input.nextInt();

        if (gender == 1)
            r = 0.73;
        else if (gender == 2)
            r = 0.66;

        double BAC = (A * 5.14 / W * r) - (.015 * H);

        System.out.println("Your BAC is " + BAC + ("."));

        if (BAC <= 0.08)
            System.out.println("It is legal for you to drive.");
        else
            System.out.println("It is not legal for you to drive.");
    }
}
