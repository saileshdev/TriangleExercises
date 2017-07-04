package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class DrawAsterisksTest {

    private DrawAsterisks drawAsterisks;

    @Before
    public void setUp() throws Exception {
        this.drawAsterisks = new DrawAsterisks("*");

    }

    @Test
    public void shouldReturnSingleAsterisk(){
        assertEquals(drawAsterisks.drawAsterisks(1),"*");
    }

}
