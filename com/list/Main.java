// Java program to demonstrate LinkedList<>

package com.list;

import java.util.*;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating the list to store double numbers
        List<Double> list = new LinkedList<>() ;

        // Adding values to the list
        list.add(2.0);
        list.add(3.1);
        list.add(1.0);
        list.add(9.);
        list.add(7.2);
        list.add(5.8);
        list.add(8.3);

        // Printing the list to console
        System.out.println(list);

        // Printing a sublist to console from index 2 to 5
        System.out.println(list.subList(2, 5));

        // Checking if there is element 9.0
        System.out.println("Is there 9.0: " + list.contains(9.0));

        // Checking if there is element 1.0
        System.out.println("Is there 9.0: " + list.contains(1.0));

        // Checking if there is element 11.0
        System.out.println("Is there 9.0: " + list.contains(11.0));

        // Removing all element from the list
        list.clear();

        // Checking if the list is empty
        System.out.println("Is list empty: " + list.isEmpty());
    }
}
