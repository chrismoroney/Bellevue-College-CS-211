/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Exercise 3: This exercise requires us to create a way to remove all even-Length strings in an arrayList
*/

package Exercises;
import java.util.*;
public class Exercise3 {
    public static void removeEvenLength(ArrayList<String> s) {
        // goes through all strings in ArrayList
        for (int i = 0; i < s.size(); i++) {
            String string = s.get(i);
            // if it is an even string...
            if (string.length() % 2 == 0) {
                // ... remove it ... 
                s.remove(i);
                // ... then set it backwards one in the for loop so that the next word is not skipped
                i--;
            }
        }
    }
}
