package com.company;

import java.util.Scanner;

public class Pattern {
    private static Scanner myScanner= new Scanner(System.in);
    public static void main (String[] args){
        int i=0;
        var userInput = myScanner.nextInt();
        for(;i<=userInput; i++){
            System.out.println("*".repeat(i));
        }
        for(;i>=0; i--){
            System.out.println("*".repeat(i));
        }
    }
}
