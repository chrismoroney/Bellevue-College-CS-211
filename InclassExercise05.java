/*
/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
In Class Exercise #5 
Due 18 May 2018
Test Client
 */
package inclassexercise.pkg05;
import java.util.*;

public class InclassExercise05 {
    public static void main(String[] args) {
        LinkedIntList myList = new LinkedIntList();
        for(int i = 9; i>0; i--){
            myList.add(i);
        }
        System.out.println("This is the original List of Ints");
        System.out.println(myList);
        myList.moveToBack();
        System.out.println("After moving the first term to the back, the list looks like this");
        System.out.println(myList);
    }
    
}
