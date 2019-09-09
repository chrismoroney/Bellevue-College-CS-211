/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Hexagon class for Exercise 16, write a method an equals method for a regular Hexagon (side a 
is length for all sides)
*/
package hw1;

// Exercise 16, write a class representing a hexagon  
public class Hexagon implements Shape {
    private double a;
    // constructs a new REGULAR Hexagon (all same sides).
    public Hexagon(double a){
        this.a = a;
    }
    // returns the side length of the Hexagon
    public double getSideLength(){
        return a;
    }
    // returns the area of the Hexagon
    public double getArea(){
        return (3.0 * Math.sqrt(3) / 2.0) * a * a;
    }
    // returns the perimeter of the Hexagon
    public double getPerimeter(){
        return 6 * a;
    }
}
