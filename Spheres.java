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
 
//Spheres class which extends Cones class
public class Spheres extends Cones {
    //Construct a sphere        
    public Spheres(double radius){
        super(radius,0);
    }
    //Return string with radius of this sphere
    public String toString() {
    	 return "Sphere: radius = "+ getR();
    }
    //Return volume of this sphere
    public double getVolume(){
         return (double)4/3 * Math.PI*Math.pow(getR(), 3);
    }
    //Return suface area of this sphere
    public double getSurfaceArea(){
        return 4 * getBaseArea();
    }
}
 
    