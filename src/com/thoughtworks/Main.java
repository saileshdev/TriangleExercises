package com.thoughtworks;


public class Main {

    public static void main(String[] args) {
	// write your code here

        PrintAsterisk printer = new PrintAsterisk();

        System.out.println("Question 1: Print 1 asterisk to the console");
        printer.printSingleAsterisk();
        System.out.println();

        System.out.println("Question 2: Print n asterisk on one line to the console(Ex: n=8)");
        printer.printHorizontalLine(8);
        System.out.println();

        System.out.println("Question 3: Print vertical to the console(Ex: n=3)");
        printer.printVerticalLine(3);
        System.out.println();

        System.out.println("Question 4: Print right triangle(Ex: n=3)");
        printer.printRightTriangle(3);
    }
}
