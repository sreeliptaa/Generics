package com.generics;
/**
 * Program to find the maximum
 * @author Sreelipta
 * @since 2021-08-17
 */
public class MaximumValue<T extends Comparable<T>> {
    T x1, x2, x3;

    public MaximumValue(T x1, T x2, T x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }
    
    /**
     * Generic method to compare any type of data and find maximum
     * @param  x1, x2, x3
     */
    public static <T extends Comparable<T>> T findMaxValues(T x1, T x2, T x3) {
        T max = x1;
        if (x2.compareTo(max) > 0)
            max = x2;
        if (x3.compareTo(max) > 0)
            max = x3;
        return max;
    }
    /**
     * In main method
     * variables are declare and initialise
     */
    public static void main(String[] args) {
        Integer a1 = 66, a2 = 45, a3 = 98;
        System.out.println("The Maximum between three integers is : " + findMaxValues(a1, a2, a3));
        Float f1 = 66.21f, f2 = 45.76f, f3 = 98.43f;
        System.out.println("The Maximum between three float is : " + findMaxValues(f1, f2, f3));
        String s1 = "apple", s2 = "banana", s3 = "peach";
        System.out.println("The Maximum between three string is : " + findMaxValues(s1, s2, s3));
    }
}
