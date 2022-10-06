package com.example.project;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArrayExercisesTest {
    @Test
    void testConvertFromStringsToArray() {
        assertArrayEquals(new int[]{30, 40, 20}, ArrayExercises.convertFromStringsToArray("30", "40", "20"));
    }

    @Test
    void testConvertToArray() {
        assertArrayEquals(new int[]{2, 3, 4}, ArrayExercises.convertToArray(2, 3, 4));

    }

    @Test
    void testGetArrayAverage() {
        assertEquals(5.5, ArrayExercises.getArrayAverage(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }

    @Test
    void testGetIndexOf() {
        assertEquals(5, ArrayExercises.getIndexOf(new String[]{"This", "is", "a", "test", "Array", "banana"}, "ba"));
    }

    @Test
    void testGetMinMax() {
        assertArrayEquals(new int[] {1,30}, ArrayExercises.getMinMax(new int[]{2, 3, 4, 5, 6, 7, 30, 8, 9, 1, 2, 3, 4, 5, 28, 15}));
    }

    @Test
    void testGetSum() {
        assertEquals(15, ArrayExercises.getSum(new int[]{1, -2, -3, 4, 5, 5}));
        assertEquals(42, ArrayExercises.getSum(new int[]{20, 20, 2, -2}));
    }

    @Test
    void testRemoveEvens() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, ArrayExercises.removeEvens(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void testReverseArray() {
        assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, ArrayExercises.reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void testSortArray() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, ArrayExercises.sortArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }
}
