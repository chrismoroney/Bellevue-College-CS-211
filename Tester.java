/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Test Client
*/

package Exercises;
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Professor Livingston (1:30) Section B");
        System.out.println("HW2 due 22 April 2018");
        System.out.println("Page 711, Exercises <1, 3, 7, 15, 18>");
        System.out.println();
        System.out.println();
        
        // uses exercise 1 class
        Exercise1 exerciseOne = new Exercise1();
        // ArrayList used for exercise
        ArrayList<String> exOneList = new ArrayList<String>();
        exOneList.add("Chris");
        exOneList.add("Brian");
        exOneList.add("Hello My name is");
        exOneList.add("Dwight");
        exOneList.add("Where is the bathroom?");
        
        
        System.out.println("Exercise 1");
        System.out.println();
        System.out.println("This ArrayList is what is being passed into the method: ");
        // Prints out the list
        System.out.println(exOneList);
        System.out.println("The average vowels for all the inputed strings is: ");   
        // Prints out the ArrayList after Sorted
        System.out.println(exerciseOne.averageVowels(exOneList));
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        // uses exercise 3 class
        Exercise3 exerciseThree = new Exercise3();
        // arrayList used for exercise
        ArrayList<String> listOfWords = new ArrayList<String>();
        listOfWords.add("Hand");
        listOfWords.add("Broken");
        listOfWords.add("Pie");
        listOfWords.add("Function");
        listOfWords.add("Irregular");
        listOfWords.add("Pencils");
        listOfWords.add("Helping Hands");
        listOfWords.add("This String has more than Two Words");
        listOfWords.add("Why");
        listOfWords.add("Do symbols work too?");
        
        System.out.println("Exercise 3");
        System.out.println();
        System.out.println("These Strings are put into the ArrayList: ");
        // prints out arraylist
        System.out.println(listOfWords);
        // filters through the arrayList
        exerciseThree.removeEvenLength(listOfWords);
        System.out.println("After removing the Strings that have an equal length, we still have these words: ");
        // prints out new arrayList
        System.out.println(listOfWords);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        // uses exercise 7 class
        Exercise7 exerciseSeven = new Exercise7();
        
        System.out.println("Exercise 7");
        // creates new arrayList
        ArrayList<String> newListOfWords = new ArrayList<String>();
        newListOfWords.add("be");
        newListOfWords.add("be");
        newListOfWords.add("is");
        newListOfWords.add("not");
        newListOfWords.add("or");
        newListOfWords.add("question");
        newListOfWords.add("that");
        newListOfWords.add("the");
        newListOfWords.add("to");
        newListOfWords.add("to");
        
        System.out.println();
        System.out.println("These Strings are put into the ArrayList: ");
        // Prints out arrayList
        System.out.println(newListOfWords);
        System.out.println("After removing the Strings that have a duplicate, we still have these words: ");
        // filters the arrayList
        exerciseSeven.removeDuplicates(newListOfWords);
        // prints it out new arrayList
        System.out.println(newListOfWords);

    
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // uses exercise 15 class
        Exercise15 exerciseFifteen = new Exercise15();
        System.out.println("Exercise 15");
        // creates new arrayList of numbers
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        
        listOfNums.add(4);
        listOfNums.add(17);
        listOfNums.add(5);
        listOfNums.add(9);
        listOfNums.add(16);
        listOfNums.add(23);
        listOfNums.add(18);
        listOfNums.add(24);
        listOfNums.add(8);
        listOfNums.add(10);
        listOfNums.add(9);
        
        // range used for the method
        int min = 10;
        int max = 20;
        System.out.println();
        System.out.println("The list of numbers (ints) that is in the Arraylist contains: ");       
        // prints out whole arrayList
        System.out.println(listOfNums);
        // filters through arrayList
        exerciseFifteen.filterRange(listOfNums, min, max);
        System.out.println("If the range requires all numbers to be in between " + min + " and " +  max  + ", then the remaining numbers are: ");
        // prints out new arrayList
        System.out.println(listOfNums);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        // uses point class for exercise 18
        Point exerciseEighteen = new Point();
        System.out.println("Exercise 18");
        // creates new arrayList of Points
        ArrayList<Point> myList = new ArrayList<Point>();
        
        
        myList.add(new Point(98,98));
        myList.add(new Point(4,2));
        myList.add(new Point(1,1));
        myList.add(new Point(99,99));
        myList.add(new Point(3,1));
        myList.add(new Point(4,2));
        myList.add(new Point(5,3));
        myList.add(new Point(4,2));
        myList.add(new Point(7,15));
        myList.add(new Point(15,7));
        
        System.out.println();
        System.out.println("These Points are inserted into the ArrayList");
        // prints out arrayList of points
        System.out.println(myList);
        // compares all points to eachother 
        exerciseEighteen.compareTo(myList);
        System.out.println("After sorting each point by acending order by Y-value, then X, the new order is: ");
        // prints out new arrayList of points
        System.out.println(myList);
    } 
}
