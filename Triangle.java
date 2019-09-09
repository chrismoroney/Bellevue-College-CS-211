/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Triangle for Exercise 14, write a method an equals method for a triangle (based on sides a b and c)
*/
package hw1;

// Represents triangle shapes.
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    
    // Constructs a new Triangle given side lengths.
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Returns this triangle's area using Heron's formula.
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Returns the perimeter of this triangle.
    public double getPerimeter() {
        return a + b + c;
    }
   
    // Exercise 14, returns "Equal" if all parameters (side lengths) are equal to each other
    public String equals(Triangle t){
        if (a == t.a && b == t.b && c==t.c){
            return "Equal";
        } else if (a == t.b && b == t.c && c==t.a){
            return "Equal";
        } else if (a == t.c && b == t.a && c==t.b){
            return "Equal";
        } else{
            return "Not Equal";
        }
    }
}
