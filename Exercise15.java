/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Exercise 15: This exercise requires us to create a method that will only keep numbers from an arraylist within a range
*/

package Exercises;
import java.util.*;
public class Exercise15 {
    // inputs an ArrayList, a minimum value, and a maximum value
    public static void filterRange(ArrayList<Integer> a, int mini, int maxi) {
        // goes through every number in the ArrayList
        for (int i = 0; i < a.size(); i++){
            // if less than the minimum or greater than maximum...
            if (a.get(i) < mini || a.get(i) > maxi){
                // remove it
                a.remove(i);
                // then send the digit backwards in the for loop so that the for loop doesn't skip any numbers
                i--;
            }
        }
    }
}
