/*
Chris Moroney
CS 211 Professor Livingston (1:30) Section B
HW2 due 22 April 2018
Page 711, Exercises <1, 3, 7, 15, 18>
Exercise 1: This exercise requires us to create a method that calculates the average vowels per string in an arrayList
*/

package Exercises;
import java.util.*;
public class Exercise1 {
    public static double averageVowels(ArrayList<String> stringList){
        // if there are no strings, then there are no vowels, returns 0
        if (stringList.isEmpty()){
            return 0.0;
        }
        int vowelCounter = 0;
        // goes through each String in the arrayList
        for (int i = 0; i < stringList.size(); i++){
            // sets the string equal to the value in the ArrayList
            String theString = stringList.get(i);
            // goes through each letter of the String
            for (int j = 0; j < theString.length(); j++){
                // finds all vowels and adds one to them
                char chString = Character.toLowerCase(theString.charAt(j));
                if (chString == 'a' || chString == 'e' || chString == 'i' || chString == 'o' || chString == 'u'){
                    vowelCounter++;
                }
            }
        } 
        // returns the average by taking the vowels and divinding by the number of Strings total
        // must be cast as a double, each vowel is added by 1, making need for VowelCounter to be an int
    return (double) vowelCounter / stringList.size();
    }
}   
    


