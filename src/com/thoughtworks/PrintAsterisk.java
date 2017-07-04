package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class PrintAsterisk {

    public void printSingleAsterisk(){
        System.out.print(new DrawAsterisks("*").drawAsterisks(1));
    }

    public void printHorizontalLine(int numberOfAsterisks){
        System.out.print(new DrawAsterisks("*").drawAsterisks(numberOfAsterisks));
    }
}
