package com.generics;

import java.util.Arrays;

/**
 * Program to find the maximum using generics
 * @author Sreelipta
 * @since 2021-08-17
 */
public class MaximumValue<T extends Comparable<T>> {

    T[] elements;

    public MaximumValue(T[] elements) {
        this.elements = elements;
    }

    /**
     * Generic method to store values in array and return maximum value.
     * @param elements
     * @return max : Maximum of three values
     */
    public static <T extends Comparable<T>> T findMaxValues(T[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        T max = elements[lenght - 1];
        return max;
    }

    public static void main(String[] args) {
        Integer[] intMax = { 23, 32, 87, 90, 82, 76, 19, 48 };
        System.out.println("The Maximumnumber of these integers is : " + findMaxValues(intMax));
        Float[] floatMax = { 2.3f, 3.2f, 8.77f, 69.7f, 4.56f, 66.87f };
        System.out.println("The Maximum number of these float is : " + findMaxValues(floatMax));
        String[] stringMax = { "pizza", "burger", "pasta", "cutlet", "pastry" };
        System.out.println("The Maximum number of these String is : " + findMaxValues(stringMax));
    }
}
