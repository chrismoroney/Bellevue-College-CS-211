/*
Chris Moroney
CS 211 Spring 2018
HW0 Due 8 April 2018
Pages 569-570, Problems 18-22
Tester 
*/

package rectangle;
import java.awt.*;

public class Test {
    public static void main(String[] args){
        Rectangle tester = new Rectangle (5,5,5,5);
        System.out.println(tester.getHeight());
        System.out.println(tester.getWidth());
        System.out.println(tester.getX());
        System.out.println(tester.getY());
        System.out.println(tester.toString());
        
        Point testerPoint = new Point(5,5);
        Rectangle pointTester = new Rectangle(testerPoint,10,20);
        System.out.println(pointTester.contains(7,5));
        System.out.println(pointTester.contains(testerPoint));
        
        System.out.println(tester.union(new Rectangle(10,3,4,4)));
        System.out.println(tester.intersection(new Rectangle(10,10,10,10)));
    }
}
