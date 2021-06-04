package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class LegalDrivingAge {
    public static void main(String[] args){
        int age;

        Scanner scnr = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = scnr.nextInt();

        if(age >= 16){
            System.out.print("You are old enough to legally drive");
        }
        else{
            System.out.print("You are not old enough to legally drive");
        }

    }
}
