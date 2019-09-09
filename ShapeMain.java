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



//Test file
public class ShapeMain {
    public static void main(String[] args){
        Shape [] shapes = new Shape [6];
      
        //RectanglularPrisms
        shapes[0]= new RectangularPrisms(1,2,3); //Shoudld return Rectangular Prism: width = 1.0, length = 2.0, height = 3.0
                                                 //Volume : 6.00 Surface area: 22.00
        //Cube
        shapes[1]= new Cubes(3);//Should return Cube: side = 3.0 volume : 27.0 Surface area: 54.00
        //Cylinders
        shapes[2] = new Cylinders(2,3);//Should return Cylinder: radius = 2.0, height = 3.0 volume : 37.70 Surface area: 62.83
        //Spheres
        shapes[3] = new Spheres(2);//Sphere: radius = 2.0 volume : 33.51 Surface area: 50.27
        //Cones
        shapes[4] = new Cones(3,5);//Cone: radius = 3.0, height = 5.0 volume : 47.12 Surface area: 83.23
        //TriangularPrisms 
        shapes[5] = new TriangularPrisms(3,4,5,1);//Triangular Prism: side a = 3.0, side b = 4.0, side c = 5.0, height = 1.0 volume : 6.00 Surface area: 24.00
        
        //print out all information about shapes
        for(int i = 0; i < shapes.length;i++){
           printInfo(shapes[i]);
        }
    }
    public static void printInfo(Shape s) {
	     //Print out details about this shape
        System.out.println(s);
        //Print out volume shape, round to 2 decimal
	     System.out.printf("volume : %.2f\n", s.getVolume());
        //Print out surface area of this shape, round to 2 decimal
	     System.out.printf("Surface area: %.2f\n", s.getSurfaceArea());
        System.out.println();
    }

}