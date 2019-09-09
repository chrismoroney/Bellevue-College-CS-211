/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Circle class for Exercise 14, write a method an equals method for a circle (based on radius)
*/

package hw1;

// Represents circle shapes.
public class Circle implements Shape {
    private double radius;
    
    // Constructs a new circle with the given radius.
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Returns the area of this circle.
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // Returns the perimeter of this circle.
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
    // Exercise 14, returns "Equal" if parameters of the circle are equal to another
    public String equals(Circle c){
        if (radius == c.radius){
            return "Equal";
        } else{
            return "Not Equal";
        }
    }
}
