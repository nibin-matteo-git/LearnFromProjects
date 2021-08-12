package com.company;

import java.util.Scanner;

public class ReverseString2{
    private static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args){
        String myVar = myScanner.nextLine();
        String myNewVar="";
        for (int i=myVar.length()-1; i>=0; i--){
            myNewVar=myNewVar+myVar.charAt(i);
        }
        System.out.println("your new string is:"+myNewVar);
    }
}