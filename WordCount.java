// Uses maps to implement a word count, so that the user
// can see which words occur the most in the book Moby Dick.

// Chris Moroney

package InClassExercise2;
import java.io.*;
import java.util.*;

public class WordCount {
    // minimum number of occurrences needed to be printed
    public static final int OCCURRENCES = 2000;
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("This program displays the most");
        System.out.println("frequently occurring words from");
        System.out.println("the book Moby Dick.");
        System.out.println();
        
        // read the book into a map
        Scanner in = new Scanner(new File("mobydick.txt"));
        // scanner will only consider letters a-z and A-Z
        in.useDelimiter("[⁁a-zA-Z']+");
        Map<String, Integer> wordCountMap = getCountMap(in);
        
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            if (count > OCCURRENCES) {
                System.out.println(word + " occurs " + count + " times.");
            }
        }
        // In class Assignment Part
        getNumber(wordCountMap);    
    }
    
    // Reads book text and returns a map from words to counts
    public static Map<String, Integer> getCountMap(Scanner in) {
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            if (!wordCountMap.containsKey(word)) {
                // never seen this word before
                wordCountMap.put(word, 1);
            } else {
                // seen this word before; increment count
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
        return wordCountMap;
    }
    public static void getNumber(Map<String, Integer> findNum) {
	// Interaction, determine what word is wanted to be found in number
        Scanner determineWord = new Scanner(System.in);
	System.out.println();
	System.out.print("Enter word to see how many times it occurred: ");	
	// String is set equal to whatever is typed in
        String word = determineWord.next().toLowerCase();
	// matches the key in the map to the value corresopnding with it (which is an int)
        if (findNum.containsKey(word)) {
	    System.out.println("The word" + word + " is found " + findNum.get(word) + " times in Moby Dick. ");
	} else {
            System.out.println("The word" + word + " was never found in the Moby Dick. ");
	}
        System.out.println();
    }
}
