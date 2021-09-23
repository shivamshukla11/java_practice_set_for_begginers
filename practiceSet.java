package com.company;

import java.util.Scanner;

public class practiceSet{
    public static void main(String[] args){
        System.out.println("the practice set is solved below");
        System.out.println("**********************************");


        // 1) Write a program to sum three numbers in Java.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();

        System.out.println("Enter the second value");
        int b=sc.nextInt();

        System.out.println("Enter the third value");
        int c=sc.nextInt();


        System.out.println("The sum of all three value is "+ (a+b+c));


        // 2) Write a program to calculate CGPA using marks of three subjects (out of 100)

        System.out.println("claculating the CGPI");
        System.out.println(" Enter the marks of physic");
        float p=sc.nextInt();
        System.out.println(" Enter the marks of chemistry");
        float c=sc.nextInt();
        System.out.println(" Enter the marks of math");
        float m=sc.nextInt();
        float sum = p+c+m;
        float cgpi = (sum)/30;
        System.out.println(cgpi);

        // 3) Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
        System.out.println("plz enter your name");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" have good day");

//         4) Write a Java program to convert Kilometers to miles.

        System.out.println("kilometers to miles converter");
        System.out.println("enter the kilometers");
        float km= sc.nextFloat();
        System.out.println("the "+km+" kilometers is equal to "+(km*1.84)+" Miles.");

        // 4) Write a Java program to detect whether a number entered by the user is an integer or not.

        System.out.println("Int or not");
        System.out.println("enter the value");
        boolean chk = sc.hasNextInt();
        System.out.println(chk);





    }
}