/**
 * UCF COP3330 Fall 2021 Assignment 7 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double length, width, areaFt, convRatio, areaM;
        Scanner scnr = new Scanner(System.in);

        convRatio = .09290304;

        System.out.print("What is the length of the room in feet? ");
        length = scnr.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        width = scnr.nextDouble();

        areaFt = length * width;
        areaM = areaFt * convRatio;

        System.out.println("You entered the dimensions of " + length + " feet by " +  width + " feet.");
        System.out.println("The area is \n" + areaFt + " square feet \n" + areaM + " square meters");

    }
}
