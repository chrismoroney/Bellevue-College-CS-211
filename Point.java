/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Exercise 18: This exercise requires us to modify the point class so that it can take points in an arrayList and sort them according
             to y-coordinate values
*/

package Exercises;

// A Point object represents a pair of (x, y) coordinates.

import java.util.ArrayList;

// part of the exercise requires us to create an interface to make the Point comparable
public class Point implements Comparable {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
       this(0, 0);    // calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point(int x, int y) {
        if (x < 0 || y < 0) {
          throw new IllegalArgumentException();
        }
   
        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof Point) {
        Point other = (Point) o;
        return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public int getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public int getY() {
        return y;
    }
    
    // Exercise 18: This is the compareTo function that will sort all of the points in ArrayList
    public void compareTo(ArrayList<Point> myList){
        // go through all points, starting with first point
        for(int i = 0; i < myList.size(); i++){
            // compare all points ahead of the first point in arrayList index
            for(int j = i + 1; j < myList.size(); j++){
                Point thisPoint = myList.get(i);
                Point otherPoint = myList.get(j);
                // if the y-value at position i in arrayList is equal to position j or the x-value at i is less than that at position j...
                if(myList.get(i).getY()==myList.get(j).getY()){
                    if(myList.get(i).getX()<myList.get(j).getX()){
                    // Do nothing                        
                    }
                // will swap positions of the points if the first y-value is larger than the compared point.
                } else if (myList.get(i).getY()>myList.get(j).getY()){
                    // Swap them
                    myList.set(i, otherPoint);
                    myList.set(j, thisPoint);
                }
                // continues process until for loops both collapse.
            }
        }
    }
    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
}
