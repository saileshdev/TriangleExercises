package com.thoughtworks;


public class Main {

    public static void main(String[] args) {
	// write your code here

        PrintAsterisk printer = new PrintAsterisk();
        printer.printSingleAsterisk();
        System.out.println();

        printer.printHorizontalLine(6);

        System.out.println();
        printer.printVerticalLine(2);
    }
}
