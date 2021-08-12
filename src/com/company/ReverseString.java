package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        var myScanner = new Scanner(System.in);
        reverse(myScanner.next());
    }
    public static void reverse(String myVar){
        String[] listOfCharsInString = new String[myVar.length()];
        int j=0;
        for(int i=myVar.length()-1; i>=0;i--){
//            listOfCharsInString[i]=myVar[j];
//            j++;
            System.out.println(listOfCharsInString);
            System.out.println(Arrays.toString(listOfCharsInString));
            System.out.println(listOfCharsInString[i]);
        }

    }
}
