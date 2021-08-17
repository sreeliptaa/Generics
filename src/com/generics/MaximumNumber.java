package com.generics;
    /**
     * Program to find the maximum of three integers
     * @author Sreelipta
     * @since 2021-08-17
     */
    public class MaximumNumber {
        /**
         * In main method
         * variables are declare and initialise
         */
        public static void main(String[] args) {
            //declaring varaibles
            int a = 27;
            int b = 43;
            int c = 32;
            //calling method to main
            findMaximumNo(a,b,c);
        }

        /**
         * Method for finding maximum number from given three integer parameters using compare to
         * @param a,b,c
         */
        private static void findMaximumNo(Integer a, Integer b, Integer c) {
            int max = a;
            if (b.compareTo(max)>0) {
                max = b;
            }
            if (c.compareTo(max)>0) {
                max = c;
            }
            System.out.println("Maximum number of given three no is " +max);
        }
    }
