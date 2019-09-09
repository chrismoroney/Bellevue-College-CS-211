/*
Chris Moroney
CS 211 Spring 2018
HW0 Due 8 April 2018
Pages 569-570, Problems 18-22
This assignment requires us to create a class representing a rectangle. 
 */
package rectangle;

// to import the art java package, which is necessary for the Point.
import java.awt.*;

public class Rectangle {
    private int width;
    private int height;
    private int x;
    private int y;
    private Point p;
    
    // Problem #18
    // Create a new rectangle with these factors: an X and Y (for coordinates) and width and height
    // (for dimensions of rectangle).
    public Rectangle(int x, int y, int width, int height) {
        if(width < 0 || height < 0){
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;   
    }
    // returns the height of Rectangle
    public int getHeight(){
        return height;
    }
    // returns width of Rectangle
    public int getWidth(){
        return width;
    }
    // returns X coordinate of Rectangle
    public int getX(){
        return x;
    }
    // returns Y coordinate of Rectangle
    public int getY(){
        return y;
    }
    // returns a String that states each inputed piece of data to the Rectangle Class (the parameters)
    public String toString(){
        return "Rectangle[x = " + x + ", y = " + y + ", width = " + width + ", height = " + height + "]";
    }
    
    // Problem #19
    // Creates another Rectangle class with parameters of a Point, Width, and Height
    public Rectangle(Point p, int width, int height){
        if(width < 0 || height < 0){
            throw new IllegalArgumentException();
        }
        this.p = p;
        this.width = width;
        this.height = height;    
    }
    // Problem #20
    // This accessor will verify whether or not there is actually an X or Y. 
    // The if statement states basically if there is any number for x and y, then return that as a boolean (which is true)
    public boolean contains(int x, int y){
        return (x <= p.x + width && x >= p.x && y <= p.y + height && y >= p.y);
    }
    // The if statment says that if the POINT inputed is contained in the rectangle then return
    // true (different from above because above is an x and y, opposed to a point)
    public boolean contains(Point p){
        return contains(p.x, p.y);
    }
    // Problem #21
    // This method will return a rectangle that contains both rectangles bound inside
    // of it
    public Rectangle union(Rectangle rect){
        // x-coordinate for the new rectangle, has to be as far left as possible to get both rectangles
        int cornerTopLeftX = Math.min(this.x, rect.x);
        // y-coordinate for the new rectangle, has to be as high as possible to get both rectangles
        int cornerTopLeftY = Math.min(this.y, rect.y);
        // necessary width to bound both rectangles, basically is just the x coordinate of both
        // rectangles subtracted by the cornerTopLeftX. The value we need needs to be the 
        // bigger value because we need to have a large enough Width to contain both
        // rectangles.
        int neededWidth = Math.max(this.x + this.width - cornerTopLeftX, rect.x + rect.width - cornerTopLeftX);
        // same concept as above, just with heights
        int neededHeight = Math.max(this.y + this.height -  cornerTopLeftY, rect.y + rect.height- cornerTopLeftY);
        return new Rectangle(cornerTopLeftX, cornerTopLeftY, neededWidth, neededHeight);
    }
    // Problem #22
    // This method requires us to find the rectangle that is contained within
    // two rectangles
    public Rectangle intersection(Rectangle rect){
        // x-coordinate of wanted rectangle
        int cornerTopLeftX = Math.max(this.x, rect.x);
        // y-coordinate of wanted rectangle
        int cornerTopLeftY = Math.max(this.y, rect.y);
        // we needed the smallest width between these two rectangles so that 
        // we can use it for finding the width of our new rectangle
        int theWidth = Math.min(this.x + this.width, rect.x + rect.width);
        // same as above just for height
        int theHeight = Math.min(this.y + this.height, rect.y + rect.height);
        // here, we take the width from above and subtract it by our new x-coordinate
        // because the result will give us the remiander distance, which is actually
        // the width we need. If the width is bigger than the x value, then that means
        // that the rectangles are not intersecting, meaning that we will produce a zero.
        int neededWidth = Math.max(0, theWidth - cornerTopLeftX);
        // same idea as above just for height
        int neededHeight = Math.max(0, theHeight - cornerTopLeftY);
        
        return new Rectangle(cornerTopLeftX, cornerTopLeftY, neededWidth, neededHeight); 
    }
    
}
