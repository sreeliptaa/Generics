package com.generics;
/**
 * Program to find the maximum of three Float numbers
 * @author Sreelipta
 * @since 2021-08-17
 */
public class MaximumFloat {
    /**
     * In main method
     * variables are declare and initialise
     */
    public static void main(String[] args) {
        //declaring varaibles
        Float a = 2.7f;
        Float b = 4.3f;
        Float c = 3.2f;
        //calling method to main
        findMaximumNo(a,b,c);
    }

    /**
     * Method for finding maximum number from given three integer parameters using compare to
     * @param a,b,c
     */
    private static void findMaximumNo(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max = c;
        }
        System.out.println("Maximum number of given three no is " +max);
    }
}

