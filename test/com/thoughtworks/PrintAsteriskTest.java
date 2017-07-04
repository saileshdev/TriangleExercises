package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class PrintAsteriskTest {

    private PrintAsterisk printer;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.printer = new PrintAsterisk();
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void shouldPrinterOneAsterisksInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "*";

        printer.printSingleAsterisk();
        assertEquals(outputStream.toString(), expected);

    }

    @Test
    public void shouldPrintSixAsterisksInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "******";

        printer.printHorizontalLine(6);
        assertEquals(outputStream.toString(), expected);

    }
}
