package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */

public class App 
{
    public static void main( String[] args )
    {
        String Month = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of the month: ");
        int MonthNum = input.nextInt();

        if(MonthNum < 1 || MonthNum >12){
            System.out.print("The month number you entered is invalid. Please try again and enter a number from 1 through 12.");
        }

        switch (MonthNum) {

            case 1:
                Month = "January";
                break;
            case 2:
                Month = "February";
                break;
            case 3:
                Month = "March";
                break;
            case 4:
                Month = "April";
                break;
            case 5:
                Month = "May";
                break;
            case 6:
                Month = "June";
                break;
            case 7:
                Month = "July";
                break;
            case 8:
                Month = "August";
                break;
            case 9:
                Month = "September";
                break;
            case 10:
                Month = "October";
                break;
            case 11:
                Month = "November";
                break;
            case 12:
                Month = "December";
                break;
        }

        System.out.printf("The name of the month is %s.", Month);

    }
}
