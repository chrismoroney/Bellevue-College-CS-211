/*
Chris Moroney
CS 211 Livingston 1:30 (Section B)
Due 26 April 2018
In-Class Exercise
Created Domino class
*/
package inclassexercisedominoes;
// creates a domino class with two face values
public class Domino {
   
    private int firstSide; 
    private int secondSide;
    //constructor: creates a domino class with two face values
    public Domino(int x, int y) {
	this.firstSide = x;
	this.secondSide = y;
    }
    // accessor: retrieves the value of the first face value
    public int getFirstSide() {
	return firstSide;
    }
    // accessor: retrieves the value of the second face value
    public int getSecondSide() {
	return secondSide;
    }
}
