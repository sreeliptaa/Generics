package com.generics;
/**
 * Program to find the maximum of three String
 * @author Sreelipta
 * @since 2021-08-17
 */
public class MaximumString {
    /**
     * In main method
     * variables are declare and initialise
     */
    public static void main(String[] args) {
        //declaring varaibles
        String a = "apple";
        String b = "peach";
        String c = "banana";
        //calling method to main
        findMaximumNo(a,b,c);
    }

    /**
     * Method for finding maximum number from given three string using compare to
     * @param  a, b, c
     */
    private static void findMaximumNo(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        System.out.println("Maximum String of given three is " +max);
    }
}
