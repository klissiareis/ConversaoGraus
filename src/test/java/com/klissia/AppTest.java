package com.klissia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testConversao(){
        float c = 40;
        float r = app.CalcularFahr(c);
        assertEquals(40, c / 5 * 9 + 32);

    }
}
