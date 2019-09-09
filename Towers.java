/*
Chris Moroney
CS 211 Livingston Section B (1:30)
Extra Credit
Due 12 June 2018
TowerOfHanoi class
 */

package extracredit; 
// This class essentially is the Tower of Hanoi. This is where all functions pertaining
// the the puzzle or movement of discs happens here.
public class Towers {
    // Initialize all of these values to help perform functions for enhancement, such as with
    // keeping track of the number of moves executed per round and over all rounds.
    private int roundMoves;
    private int totalMoves;
    private int numberOfGames;
    
    // returns an int that determines the number of moves executed in a single round
    public int getRoundMoves(){
        return roundMoves;
    }
    // returns an int that determines the number of games played by the user
    public int getNumberOfGames(){
        return numberOfGames;
    }
    // returns an int that determines the total number of moves from all rounds
    // -- is dependent on the addMoves() method
    public int getTotalMoves(){
        return totalMoves;
    }
    // adds the number of moves per round and adds it to the total
    public void addMoves(){
        totalMoves += roundMoves;
    }
    // resets the number of moves per round to zero (done so after one puzzle is finished)
    public void setNumberOfMoves(){
        roundMoves = 0;
    }
    // increases the number of puzzles played by the user.
    public void increaseGameCount(){
        numberOfGames++;
    }
    // executes the movement of discs. In other words, the method that solves 
    // the puzzle for the user. 
    public void move(int n, String beginning, String storage, String finish) {
        // add one to the roundMoves int whenever there is recursion that comes back to
        // this point
        roundMoves++;
        // if n is not equal to one...
        if (n != 1) {
            // then recursively call this function. We switch finish and beginning 
            // because this way, we move the first disc into the storage, and then 
            // the disc afterwards into the end. Then, we need to put the first disc ontop of the 
            // second, and figure out what to do about the third and how to get the first two
            // on top of the third. By alternating the location of where it is put, we are able to accomplish
            // this problem
            move((n - 1), beginning, finish, storage);
            // Establish where we move which disc to where
            System.out.println("Disc # " + n + ": " + beginning + " -> " + finish);
            // Same concept as above, tho this part is solving what happens when we need to put things from the storage
            // back into the start. For instance, we already may have our largest disc (if it is the third)
            // in the finish, but we need to put disc one into the start because we need to free up
            // the second disc to put onto the third. This is what this line accomplishes.
            move((n - 1), storage, beginning, finish);
        } else {
            // This is always going to be disc one. Disc one is always going into the 
            // finish, which will be the first and last moves of the program of even numbered n, as well as the 
            // moves whenever we put disc one on top of the second disc. 
            System.out.println("Disc # " + n + ": " + beginning + " -> " + finish);
        }
    }
}