package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
//        //1. Add two numbers given by the user.
//        System.out.println("Enter two numbers to add: ");
//        System.out.print("first number: ");
//        a = input.nextInt();
//        System.out.print("Enter second number: ");
//        b = input.nextInt();
//        System.out.printf("%d + %d = %d \n", a, b, add(a, b));
//        //2.----------------------------------------------------
//        System.out.println("Enter two numbers to divide");
//        System.out.print("First number: ");
//        a=input.nextInt();
//        System.out.print("Second number: ");
//        b=input.nextInt();
//        div(a,b);
//        //3.----------------------------------------------------
//        ArrayList<String> letters = new ArrayList<>();
//        System.out.println("Enter 5 letters to sort in alphabetical order.");
//        for(int i=0;i<5;i++){
//            System.out.print("Enter a letter: ");
//            letters.add(input.nextLine());
//        }
//        sortLetters(letters);
//        //5.----------------------------------------------------
//        System.out.println("This displays the the average of three numbers.");
//        int[] numbers = {75,87,99};
//        System.out.print("The average of 75, 87, 99 is "+average(numbers));
        //6.----------------------------------------------------
        System.out.println("This will check what year is a leap year form 1999 to present year.");
        leapYearFrom(1999);
        //
    }

    private static void leapYearFrom(int year) {
        for(int i=year;i<=2019;i++){
            if(i%4==0){
                System.out.printf("%d is a leap year.\n",i);
            }else{
                System.out.printf("%d is not a leap year.\n",i);
            }
        }
    }

    private static int average(int[] numbers) {
        int sum=0, total;
        for(int num: numbers){
            sum+=num;
        }
        return sum/numbers.length;
    }

    private static void sortLetters(ArrayList<String> letters) {
        Collections.sort(letters);
        System.out.println(letters);
    }

    private static int add(int a, int b){
        return a+b;
    }

    private static void div(int a, int b){
        if(b==0){
            System.out.println("Undefined");
        }else{
            System.out.printf("%d / %d = %d \n",a,b,a/b);
        }
    }

}