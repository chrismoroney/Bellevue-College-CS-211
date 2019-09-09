/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Octagon class for Exercise 15, write a method an equals method for a regular Octagon (side a 
is length for all sides)
*/
package hw1;

// Exercise 15, write a class representing an Octagon
public class Octagon implements Shape {
    private double a;
    // constructs a new REGULAR octagon (all same sides).
    public Octagon(double a){
        this.a = a;
    }
    // returns the side lengths of the Octagon
    public double getSideLength(){
        return a;
    }
    // returns the area of the Octagon
    public double getArea(){
        return 2 * (1 + Math.sqrt(2)) * a * a;
    }
    // returns the Perimeter of the Octagon
    public double getPerimeter(){
        return 8 * a;
    }
}
