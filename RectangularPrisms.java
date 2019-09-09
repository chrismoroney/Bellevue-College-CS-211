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

//RectangluarPrisms class which implements Shapes interface
public class RectangularPrisms implements Shape {
    private double width;
    private double length;
    private double height;
    
    //Construct a rectangluar prism
    public RectangularPrisms(double width, double length, double height) {
        //Throw a illegal argument exception if the width, length, and height is negative
        if(width < 0 || length < 0 || height < 0) {
            throw new IllegalArgumentException("Width, length and height entered must be positive.");
        }
        this.width = width;
        this.length = length;
        this.height = height;
    }
    //Return width
    public double getWidth() {
    	return width;
    }
    //Return length
    public double getLength() {
    	return length;
    }
    //Return height
    public double getHeight(){
        return height;
    }
    //Return string with width, length, and height of this rectangular prism
    public String toString() {
    	 return "Rectangular Prism: width = " + width + ", length = " + length + ", height = " + height;
    }
    //Return volume of this rectangular prism
    public double getVolume(){
        return  length * width * height;
    }
    //Return surface area of this rectangular prism
    public double getSurfaceArea(){
        return 2 * ((width * length) + (width * height) + (length * height));
    }
}
    
