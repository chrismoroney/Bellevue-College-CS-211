/* Group: Project Team 3 
   Group members: Christorpher Moroney(Team Leader), Di Zheng, Ema Ikeda, Hanjie Bao, Nicholas Chambers, Preeti Sulgaonkar
   Course: CS211
   Date:   04/13/2018
   The Goal: Page 660/Chapter 9/Programming Project 1
   Write an inheritance hierarchy of three-dimensional shapes. 
   Make a top-level shape interface that has methods for getting information such as the volume and surface area of a three-dimensional shape. 
   Then make classes and subclasses that implement various shapes such as cubes, rectangular prisms, spheres, triangular prisms, cones, and cylinders. 
   Place common behavior in superclasses whenever possible, and use abstract classes as appropriate. 
   Add methods to the subclasses to represent the unique behavior of each three-dimensional shape, such as a method to get a sphere's radius.            
*/

//Cubes class which extends RectangularPrisms class
public class Cubes extends RectangularPrisms {
    //Construct a cube
    public Cubes(double side) {
        super(side,side,side);
    }
    //Return string with side of this cube
    public String toString() {
        return "Cube: side = " + getWidth();
    }
      
}