package com.raingxm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(3);
        assertEquals(new Dollar(6), five.times(2));
        assertEquals(new Dollar(9), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(3);
        assertEquals(new Franc(6), five.times(2));
        assertEquals(new Franc(9), five.times(3));
    }

}