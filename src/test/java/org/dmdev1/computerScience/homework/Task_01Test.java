package org.dmdev1.computerScience.homework;

import org.dmdev1.computerScience.methods.homework.Task_01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_01Test {

    @Test
    void testFirstQuarter() {
        assertEquals("в первую", Task_01.getQuarter(5));
    }

    @Test
    void testSecondQuarter() {
        assertEquals("во вторую", Task_01.getQuarter(20));
    }

    @Test
    void testThirdQuarter() {
        assertEquals("в третью", Task_01.getQuarter(35));
    }

    @Test
    void testFourthQuarter() {
        assertEquals("в четвертую", Task_01.getQuarter(50));
    }

    @Test
    void testOutOfRangeNegative() {
        assertEquals("Out of range", Task_01.getQuarter(-5));
    }

    @Test
    void testOutOfRangeAboveSixty() {
        assertEquals("Out of range", Task_01.getQuarter(60));
    }
}
