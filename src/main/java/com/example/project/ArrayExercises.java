package com.example.project;

/* 
 Module: CS4421 (ISE)
 Lecturer: Dr. Salim Saay
 Teaching Assistants: Adam J. Doherty & Ivan Guevara
*/

/*
 * In this exercise you will fill in the blanks 
 */


public class ArrayExercises {
    




    // Exercise 1: Given the 3 inputs in the method signature, return an array with the three inputs in it. The
    // Example input: a = 2, b = 5, c = 30
    // Expected return: array[]{2, 5, 30}
    public static int[] convertToArray(int a, int b, int c){
        // Your code goes here!
        return new int[0];
    }

    // Exercise 2: You will be given 3 inputs that are strings. 
    // Each of these strings will be integer numbers in string format. The
    // Your goal is to return an int array with the 3 inputs but in the form of integers.
    // Tip: Remeber last week we talked about using the Integer.parseInt() to parse Strings into numbers. 
    public static int[] convertFromStringsToArray(String a, String b, String c){
        // Your code goes here!
        return new int[0];
    }

    // Find the max and min values in an array
    // Exercise 3: You will be given an array of integers as an input. The
    // Your goal is to return a new array holding both the max and min numbers from the input array. The
    // Example input: input = {1, 2, 3, 4, 5, 6, 7, 8};
    // Expected Return: output = {1, 8}
    public static int[] getMinMax(int[] input){
        // Your code goes here!
        return new int[0];
    } 


    // sum the value of an array
    // Exercise 4: You will be given an integer array as the input. 
    // Your goal is to return the sum all the positive numbers.
    // Example input: input = {1, -2, -3, 4, 5, 5} 
    // Expected Return: 15
    public static int getSum(int[] input){
        // Your code goes here!
        return -1;
    }


    // Calculate the average value of an array
    // Exercise 5: Given the integer array input, return the average of the values.
    public static double getArrayAverage(int[] input){
        // Your code goes here!
        return -1.0;
    }


    // Return the index of a needle 
    // Exercise 6: Given an array of strings and a string needle, 
    // you are to return the first index of the string that contains the needle. 
    // If the needle does not exist, return -1 instead
    // Example input: input = {"Hello", "World", "How", "Are", "You", "Getting", "on"} needle = "ge"
    // Expected Return: 5
    public static int getIndexOf(String[] input, String needle){
        return -1;
    }
    
    // Reverse an array 
    // Exercise 7: In this exercise, you are to reverse an array.
    // Example input: input = {1, 2, 3, 4, 5, 6, 7}
    // Expected Return: output = {7, 6, 5, 4, 3, 2, 1}
    public static int[] reverseArray(int[] input){
        return new int[0];
    }


    // Remove all even numbers from an arrays
    // Exercise 8: Given the input array of integers, 
    // you are to remove all even numbers and return a new array containing all none even numbers. 
    public static int[] removeEvens(int[] input){
        return new int[0];
    }
    // Sort an array Text/Int's
    // Exercise 9: You are given an unordered input array of integers. 
    // Your goal is to return a sorted array of integers in ascending order
    // Note: Don't use Arrays.sort() to complete this challenge, we would like you to implement a method of sorting these integers.
    // Example input: input = {1, 4, 2, 7, 3, 13, 11, 9}
    // Expected return: output = {1, 2, 3, 4, 7, 9, 11, 13}
    public static int[] sortArray(int[] unsortedArray){
        return new int[0];
    } 



}
