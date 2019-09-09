/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Exercise 7: This exercise requires us to create a way for removing any duplicate strings in an ArrayList
*/

package Exercises;
import java.util.*;
public class Exercise7 {
    public static void removeDuplicates(ArrayList<String> list) { 
        // starts comparison of strings with the first String in the ArrayList
        for (int i = 0; i < list.size(); i++) { 
            // compares the first String to every single String after it
            for (int j = i+1; j < list.size(); j++){       
                // If the two strings are identical, then remove it
                if (list.get(i).equals(list.get(j))) {
                    list.remove(i); 
                }
            }
        } 
    }
}
