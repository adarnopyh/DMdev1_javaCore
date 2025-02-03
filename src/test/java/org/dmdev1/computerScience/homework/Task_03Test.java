package org.dmdev1.computerScience.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_03Test {
    @Test
    void testTrianglesCompareWhenFirstTriangleBigger() {
        assertEquals("первый треугольник больше", Task_03.trianglesCompare(0.3, 0.2));
    }

    @Test
    void testTrianglesCompareWhenFirstTriangleSmaller() {
        assertEquals("первый треугольник меньше", Task_03.trianglesCompare(0.1, 0.2));
    }

    @Test
    void testTrianglesCompareWhenFirstTriangleSame() {
        assertEquals("первый треугольник равен второму", Task_03.trianglesCompare(0.999, 0.999));
    }
    @Test
    void triangleAreaWhen1And2Then1() {
        assertEquals(1, Task_03.triangleArea(1, 2));
    }

    @Test
    void triangleAreaWhenMinus1And7ThenNaN() {
        assertEquals(Double.NaN, Task_03.triangleArea(-1, 7));
    }


}