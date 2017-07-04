package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class PrintAsterisk {

    public void printSingleAsterisk(){
        System.out.print(new DrawAsterisks("*").drawHorizontalAsterisks(1));
    }

    public void printHorizontalLine(int numberOfAsterisks){
        System.out.print(new DrawAsterisks("*").drawHorizontalAsterisks(numberOfAsterisks));
    }

    public void printVerticalLine(int numberOfAsterisks){
        System.out.print(new DrawAsterisks("*").drawVerticalAsterisks(numberOfAsterisks,"\n"));
    }
}
