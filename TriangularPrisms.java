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
 
//TriangularPrisms class which implements Shape interface
public class TriangularPrisms implements Shape{
    private double a;
    private double b; 
    private double c;
    private double height;
    
    //Construct a triangular prism
    public TriangularPrisms(double a, double b, double c, double height){
       //Throw a illegal argument exception if it cannot construct a triangular prism
       if(!(a+b > c&& a+c > b && c+ b>a)) {
           throw new IllegalArgumentException("The sum of two sides should be bigger than the third side.");
       }
        this.a = a;
        this.b =b;
        this.c = c;
        this.height = height;            
    }
    //Return string with side a, b, c, and height of this triangular prism
    public String toString() {
    	 return "Triangular Prism: side a = " + a + ", side b = " + b + ", side c = " + c + ", height = "+ height;
    }
    //Return base area of this triangular prism
    public double getBaseArea() {
         double s = (a + b + c) / 2.0;
         return  Math.sqrt((s)*(s-a)*(s-b)*(s-c));
    }
    //Return volume of this triangular prism
    public double getVolume(){
         return getBaseArea() * height;
    }
    //Return surface are of this triangular prism
    public double getSurfaceArea(){
        return height * (a + b + c) + 2 * getBaseArea();
    }
}