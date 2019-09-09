/*
Chris Moroney
CS 211 Livingston Section B (1:30)
Page 750 Exercise <2, 4, 6, 8, 13>
Due April 27 2018
*/
package moroneychrishw03;
import java.util.*;

public class MoroneyChrisHW03 {
// tester
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        Set<String> names = new HashSet<String>();
        Map<String, String> names2 = new HashMap<String, String>();
        Map<String, String> names3 = new HashMap<String, String>();
        
        list.add(34);
        list.add(9);
        list.add(25);
        list.add(91);
        list.add(4);
        list.add(75);
        list.add(3);
        list.add(53);
        list.add(3);
        list.add(2);
        
        list2.add(532532);
        list2.add(235);
        list2.add(19020);
        list2.add(2353);
        list2.add(532);
        list2.add(532);
        list2.add(532);
                                
        names.add("Carl");
        names.add("Lucifer");
        names.add("Livingston"); // longest with 10 letters
        names.add("Chris");
        names.add("Mustafa");
        names.add("Earl");
        names.add("Wallace");
        names.add("Xavier");
        names.add("Henry");
        names.add("Noah");
        
        // in isUnique(), should return true
        names2.put("Chris", "Moroney");
        names2.put("Dr.", "Livingston");
        names2.put("Romeo", "Montague");
        names2.put("Juliet", "Capulet");
        names2.put("Super", "Man");
        names2.put("Captain", "America");
        names2.put("Black", "Panther");
        names2.put("Deep", "Blue Sea");
        
        // in isUnique(), should return false
        names3.put("Chris", "Moroney");
        names3.put("Dr.", "Livingston");
        names3.put("Romeo", "Montague");
        names3.put("Juliet", "Montague");
        names3.put("Super", "Man");
        names3.put("Captain", "Panther");
        names3.put("Black", "Panther");
        names3.put("Deep", "Blue Sea");
        
        
        
        
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Livingston Section B (1:30)");
        System.out.println("Page 750 Exercise <2, 4, 6, 8, 13>");
        System.out.println("Due April 27 2018");
        System.out.println();
        System.out.println();
        
        // HW3Ex02
        System.out.println("Exercise 2 // HW3Ex02");
        System.out.println();
        System.out.println("This is the first list of numbers: ");
        System.out.println(list);
        System.out.println();
        System.out.println("This is the second list of numbers:");
        System.out.println(list2);
        System.out.println();
        System.out.println("Starting with the first list, the lists of numbers alternate into this new list: ");
        System.out.println(alternate(list, list2));
        System.out.println();
        System.out.println("Since the first list has more numbers, after the last 523 from the second list, all the numbers are from list one");
        System.out.println();
        
        // HW3Ex04
        System.out.println();
        System.out.println("Exercise 4 // HW3Ex04");
        System.out.println();
        System.out.println("This is the list of numbers used: ");
        System.out.println(list2);
        System.out.println();
        System.out.println("This is the partitioning value");
        System.out.println("1000");
        System.out.println();
        System.out.println("After partitioning, all values less than 1000 are place in the front, and all values above 1000 are in the back of the list");
        System.out.println(partition(list2, 1000));
        System.out.println();
        System.out.println("Note that not all the numbers are in ascending order, just in partitioning form.");
        System.out.println();
        
        // HW3Ex06
        System.out.println();
        System.out.println("Exercise 6 // HW3Ex06");
        System.out.println();
        System.out.println("This is the list of numbers used: ");
        System.out.println(list2);
        System.out.println();
        System.out.println("Here are the number of unique numbers found in the list: ");
        System.out.println(countUnique(list2));
        System.out.println();
        
        // HW3Ex08
        System.out.println();
        System.out.println("Exercise 8 // HW3Ex08");
        System.out.println();
        System.out.println("Here are the list of Strings (names) being used");
        System.out.println(names);
        System.out.println();
        System.out.println("As seen here, the longest String appears to be 'Livingston', which has this many letters: ");
        System.out.println(maxLength(names));
        System.out.println();
        
        // HW3Ex13
        System.out.println();
        System.out.println("Exercise 13 // HW3Ex13");
        System.out.println();
        System.out.println("Here is the map of Strings(names) being used");
        System.out.println(names2);
        System.out.println();
        System.out.println("There are no duplictes of any values (last names), which means that the map of names is unique, given by the boolean below: ");
        System.out.println(isUnique(names2));
        System.out.println();
        System.out.println("However, if the map of names is changes slightly to this: ");
        System.out.println(names3);
        System.out.println();
        System.out.println("Captain and Black lead to value Panther as well as Romeo and Juliet to Mantague, which means the map is not unique: ");
        System.out.println(isUnique(names3));
        System.out.println();
    }
// HW3Ex02 -- method that alternates between proudcing integers from their respective lists
//         -- will proudce the remainder of one lists numbers if the other list runs out
    public static List<Integer> alternate(List<Integer> firstList, List<Integer> secondList) {
        // the inputed lists have to be named; iterator because it can access data in the lists
        Iterator<Integer> first = firstList.iterator();
        Iterator<Integer> second = secondList.iterator();
        // this list is what will be returned
        List<Integer> returningList = new ArrayList<Integer>();
        // while both lists still has another piece of data, activate this loop
        while(first.hasNext() || second.hasNext()) {
            // first, add to the list if the first list has a piece of data, if not, ignore
            if (first.hasNext()) {
                returningList.add(first.next());
            }
            // next, add data to the list of the second list has a piece of data, if not, ignore
            if (second.hasNext()) {
                returningList.add(second.next());
            }
            // keeps adding to the new List until both lists are finished
        }
        return returningList;
    }

// HW3Ex04 -- method that will put all integer values in a list first if less than the E value, and all others afterthe less than values
//         -- will not sort biggest to smallest, but will put all values less than E at the front
    public static List<Integer> partition(List<Integer> list, int E){
        // need iterator in order to access data in the list
        Iterator<Integer> sorter = list.iterator();
        // we will insert values from list into returningList
        ArrayList<Integer> returningList = new ArrayList<Integer>();
        // make for each loop to read each value in ther "list"
        for (int n : list)
            // if it's smaller than the E value, add to the 0th position
            if (n < E){
                returningList.add(0, n);
            // if it's bigger than the E value, add to position after
            } else {
                returningList.add(n);
            }
        return returningList;
    } 
    
// HW3Ex06 -- method that will count number of unique numbers in a list
    public static int countUnique(List<Integer> l) {
        // hashset is critical for this problem because if it is not a hashset (where order is unpredictable), 
        // then the program will mess up
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
        // because we use a for each loop, the duplicated numbers will be sent back into the
        // hashset in the same index, just repeated multiple times. However, there is a difference between
        // the list size and hashset size because of how the hashset stores a value once in an index,
        // but over multiple times
        for(int n : l)
            uniqueNumbers.add(n);

        return uniqueNumbers.size();
    }
    
// HW3Ex08 -- method that will find the longest word in a Set and return its length
    public static int maxLength(Set<String> words) {
        // initialize a max value to start
        int newMax = 0;
        // create an iterator to access strings in the set
        Iterator<String> sweeper = words.iterator();
        // while there is still a String in the set...
        while (sweeper.hasNext()) {
            // set theWord = to that next String
            String theWord = sweeper.next();
            // if it's length is longer than the new Max, then we set the variable as
            // the new maximum value.
            if (theWord.length() > newMax) {
                newMax = theWord.length();
            }
        }
        return newMax;
    }
    
// HW3Ex13 -- method that determines whether a map is entirely unique
//         -- if one key leads to two values, will be false, but if two keys lead to one value, it will still be true
    public static boolean isUnique(Map<String, String> combos) {
        // We need a hashset because the order of the String "combos" don't matter,
        // we just need to make sure there are no duplicates
        HashSet<String> catelog = new HashSet<String>();
        // initialize the variable name
        String name;
        // for each loop helps us get each combo of names in the Map
        for(String key : combos.keySet()) {
            // set our string name equal to whatever name comes next
            name = combos.get(key);
            // if there is a dupliate present, it will return false
            // we need to do it multiple times, which is why we have the if statement
            if(catelog.contains(name)){
                return false;  
            }            
            // we add the name to our so we can find duplicates
            catelog.add(name);
            
        }
        return true;
    }       
}