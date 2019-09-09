/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
Tester 
*/
package hw1;

public class HW1Tester {
    public static void main(String[] args) {
        // Exercise 12 test
        
        // Creates two timespans to be compared
        TimeSpan a = new TimeSpan(2, 30);
        TimeSpan b = new TimeSpan(1, 90);
        // calls on the equals method inside of class TimeSpan to see if these two 
        // timespans are equal. 
        System.out.println(b.equals(a));
        System.out.println();
        
        
        // Exercise 13 test
        
        // Creates two cash values to be compared
        Cash c = new Cash(400);
        Cash d = new Cash(300);
        // calls on the equals method inside of class Cash to see if these two 
        // cash values are equal. 
        System.out.println(d.equal(c));
        System.out.println();

        
        // Exercise 14 test
        
        // creates a new circle, rectangle, and triangle with given parameters
        // circle with radius 5
        Circle circ = new Circle(5);
        // rectangle with width 4 and height 6
        Rectangle rect = new Rectangle(4,6);
        //triangle with side a=3, b=5, and c=8
        Triangle tri = new Triangle(3,5,8);
        
        // creates another circle, rectangle, and triangle that with given parameters
        // circle with radius 5
        Circle cir = new Circle(5);
        // rectangle with width 3 and height 6
        Rectangle rec = new Rectangle (3,6);
        // triangle with side a=3, b=2, and c=8
        Triangle tr = new Triangle (3,2,8);
        
        // Prints whether or not each circle, rectangle, or triangle is equal in parameters
        // to the other of its kind (circle to circle etc)
        System.out.println(circ.equals(cir));
        System.out.println(rect.equals(rec));
        System.out.println(tri.equals(tr));
        System.out.println();
        
        
        // Exercise 15 test
        
        // Creates a new Regular Octagon with side lengths 7
        Octagon oct = new Octagon(7);
        // Prints out the length of each side length (since all are the same, prints out just
        // one double)
        System.out.println(oct.getSideLength());
        // Prints out area of the octagon
        System.out.println(oct.getArea());
        // Prints out the perimeter of the octagon
        System.out.println(oct.getPerimeter());
        System.out.println();
        
        // Exercise 16 test
        // Creates a new Regular Hexagon with side lengths 4
        Hexagon hex = new Hexagon(4);
        // Prints out the length of each side length (since all are the same, prints out just
        // one double)
        System.out.println(hex.getSideLength());
        // Prints out the area of the Hexagon
        System.out.println(hex.getArea());
        // Prints out the perimeter of the hexagon
        System.out.println(hex.getPerimeter());
        System.out.println();
        
        
        // proof that interface Shape works
        Shape[] shapes = {circ, cir, rect, rec, tri, tr, oct, hex};
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].getPerimeter());
        }
    }
}
