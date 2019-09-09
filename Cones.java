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

//Cones class implements Shape interface
public class Cones implements Shape{
    private double radius;
    private double height;
    //Construct a cone   
    public Cones(double radius, double height){
        
        this.radius = radius;
        this.height = height;
    }
     //Return radius of this cone
    public double getR(){
        return radius;
    }
    //Return height of this cone
    public double getHeight(){
        return height;
    }
     //Return string with radius and height of this cone
    public String toString() {
    	 return "Cone: radius = "+ getR() + ", height = "+ getHeight();
    }
    
    //Return base area of this cone
    public double getBaseArea(){
        return  Math.PI * Math.pow(getR(), 2);
    }
   
    //Retrun volume of this cone
    public double getVolume(){
         return (double)1/3 * getBaseArea() * getHeight();
    }
    //Return surface are of this cone
    public double getSurfaceArea(){ 
         return Math.PI * getR() * (getR() + Math.sqrt(Math.pow(getHeight(),2) + Math.pow(getR(),2)) );   
    }
}