package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class DrawAsterisks {

    private String asterisk;

    public DrawAsterisks(String asterisk){
        this.asterisk = asterisk;
    }

    public String drawAsterisks(int value){
        String asterisksStrings = "";

        for (int i = 0; i < value; i++){
            asterisksStrings += asterisk;
        }

        return asterisksStrings;
    }
}
