package com.bridgelabz.linecomparison;

/**
 * Line comparison computation problem
 */

import java.util.Scanner;

public class LineComparison {
    //variable
    int x1, x2, y1, y2;
    Scanner sc = new Scanner(System.in);

    public void lengthOfLine() {
        //Take input from user
        System.out.println("Enter Cartesian Co-ordinates");
        System.out.println("Enter x1: ");
        x1 = sc.nextInt();
        System.out.println("Enter x2: ");
        x2 = sc.nextInt();
        System.out.println("Enter y2: ");
        y1 = sc.nextInt();
        System.out.println("Enter y2: ");
        y1 = sc.nextInt();
        //calculation
        System.out.println("Length of line: " + (int) (Math.sqrt(Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program.!!!");
        LineComparison lineMethods = new LineComparison();
        lineMethods.lengthOfLine();
    }
}
