package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class DrawAsterisks {

    public String drawAsterisks(int value){
        String asterisksStrings = "";

        for (int i = 0; i < value; i++){
            asterisksStrings += "*";
        }

        return asterisksStrings;
    }
}
