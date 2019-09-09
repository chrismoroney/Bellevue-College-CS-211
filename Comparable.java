/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Interface for Exercise 18
*/

package Exercises;
import java.util.*;
// A Point class is considered "comparable" if it has an X, Y, and involves a compareTo method
public interface Comparable {
    public int getX();
    public int getY();
    public void compareTo(ArrayList<Point> myList);
}
