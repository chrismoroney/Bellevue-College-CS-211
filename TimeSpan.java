/*
Chris Moroney
CS 211 Spring 2018
HW1 Due 15 April 2018
Page 660, Exercises 12-16
TimeSpan class for Exercise 12, write an equals method to indicate whether two timespans
are equal to eachother or not.
*/
package hw1;

public class TimeSpan {
   private int totalMinutes;

   // Constructs a time span with the given interval.
   // pre: hours >= 0 && minutes >= 0
   public TimeSpan(int hours, int minutes) {
      totalMinutes = 0;
      add(hours, minutes);
   }
   public int getTotalMinutes(){
       return totalMinutes;
   }
    
   // Adds the given interval to this time span.
   // pre: hours >= 0 && minutes >= 0
   public void add(int hours, int minutes) {
      totalMinutes += 60 * hours + minutes;
   }

   // Returns a String for this time span such as "6h15m".
   public String toString() {
      return (totalMinutes / 60) + "h" + 
            (totalMinutes % 60) + "m";
   }
   
   // Exercise 12: Returns a string determining if the timespans are equal to eachother.
   public String equals(TimeSpan b){
        if (getTotalMinutes() == b.getTotalMinutes()){
            return "Equal";
        } else {
            return "Not Equal";
        }
    }
}
