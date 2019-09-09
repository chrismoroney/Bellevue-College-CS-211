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

//Cylinders class which extends Cones Class
public class Cylinders extends Cones{
    
     
    //Construct a cylinder
    public Cylinders(double radius, double height){
        super(radius,height);
    }
   //Return string with radius and height of this cylinder
    public String toString() {
    	 return "Cylinder: radius = "+ getR() + ", height = "+ getHeight();
    }
    //Return base perimeter of this cylinder
    public double getBasePerimeter(){
        return 2* Math.PI * getR();
    }
    //Return volume of this cylinder
    public double getVolume(){
        return getBaseArea() * getHeight();
    }
    //Return surface area of this cylinder
    public double getSurfaceArea(){
        return getBasePerimeter() * getHeight() + 2 * getBaseArea();
    }

}