/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class AreaRectangularRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int length = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        int width = scanner.nextInt();

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        double squareFeet = length * width;

        final double conversion = 0.09290304;

        double squareMeters = squareFeet * conversion;
        System.out.println("The area is");
        System.out.println(squareFeet + " square feet");
        System.out.println(squareMeters + " square meters");

    }
}
