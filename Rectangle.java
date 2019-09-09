/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Rectangle class for Exercise 14, write a method an equals method for a Rectangle
(based on width and height)
*/

package hw1;

// Represents rectangle shapes.
public class Rectangle implements Shape {
    private double width;
    private double height;
    
    // Constructs a new rectangle with the given dimensions.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Returns the area of this rectangle.
    public double getArea() {
        return width * height;
    }
    
    // Returns the perimeter of this rectangle.
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
    // Exercise 14, returns "Equal" if all parameters (side lengths) are equal to each other
    public String equals(Rectangle r){
        if ((width == r.width && height == r.height) || (width == r.height && height == r.width)){
            return "Equal";
        } else{
            return "Not Equal";
        }
    }
}
