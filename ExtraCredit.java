/*
Chris Moroney
CS 211 Livingston Section B (1:30)
Extra Credit -- Towers of Hanoi Page 828 P.P. #2
Due 12 June 2018
Main Client
 */
package extracredit;

import java.util.Scanner;

public class ExtraCredit {

    // Programming Project #2 Page 828 -- write a solution that solves a Tower of Hanoi puzzle
    //                        -- Objective: move all discs from Start to End
    //                        -- discs from the Tower can only be removed one at a time
    //                        -- discs cannot be stacked on top of a smaller disc
    //                        -- you get 3 locations to stack discs: Start, End, and Storage
    
    public static void main(String[] args){
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Livingston Section B (1:30)");
        System.out.println("Extra Credit -- Towers of Hanoi Page 828 P.P. #2");
        System.out.println("Due 12 June 2018");
        
        System.out.println();
        // this is true
        System.out.println("Note to professor, I did not use this project for Group Project 2, nor confer with any classmates who have accomplished this project.");
        System.out.println();
        System.out.println();
        
        // Again, I did not use this problem for GP2
        System.out.println("The program will create a solution set for any Tower of Hanoi puzzle.");
        System.out.println();
        // creates a new "Tower" to start program
        Towers towersOfHanoi = new Towers();
        System.out.print("Please enter a positive number of discs (0 to quit): ");
        // create a scanner that takes in an integer, which determines the number of 
        // discs in the tower of Hanoi
        Scanner numberOfDiscs = new Scanner(System.in);
        // initialize a discTotal which will activate the while loop and determine which
        // way the program will trace in the if loop.
        int discTotal = 1;
        // while discTotal is not equal to zero...
        while (discTotal != 0){
            // the next value loaded into the scanner is equal to discTotal
            discTotal = numberOfDiscs.nextInt();
            // if the inserted value is not positive...
            if (discTotal < 0){
                // then force the user to enter in a positive number
                System.out.println();
                System.out.print("Error: Please only enter in a POSITIVE number: ");
            // if the inserted value is larger than 0 ...
            } else if (discTotal > 0){
                // increase the number of games played from Towers class
                towersOfHanoi.increaseGameCount();
                // use the move method from Towers class with the following information: number
                // of discs, Start location, Storage Location, and End location
                towersOfHanoi.move(discTotal, "Start", "Storage", "End");
                System.out.println();
                // Once the program is finished from the Towers class, determines the 
                // number of moves it took for the program to finish the Tower of Hanoi
                // puzzle (number will always be same, lowest number of moves).
                System.out.println("Moves this round: " + towersOfHanoi.getRoundMoves());
                System.out.println();
                // We call on these two methods from the Towers class. addMoves() is used to 
                // add the total number of moves from ALL puzzles solved. setNumberOfMoves() is
                // called on in order to reset the number of moves PER round. Each number of moves per round
                // is added by using the addMoves method.
                towersOfHanoi.addMoves();
                towersOfHanoi.setNumberOfMoves();
                // Prompts the user to insert another int value
                System.out.print("Enter another number of discs (0 to quit): ");
            // if the discTotal is equal to 0 (meaning the user wants to stop using the program)...
            } else {
                System.out.println();
                // Thank you for using!
                System.out.println("Thank you for playing my Tower of Hanoi game!");
                System.out.println();
                System.out.println("Game Stats:");
                // Prints the number of games played, which adds one from the increaseGameCount() method
                // from whenever a puzzle was solved. 
                System.out.println("Games Played: " + towersOfHanoi.getNumberOfGames());
                // Prints the total number of moves done from all games, which is kept track from the
                // addMoves() method.
                System.out.println("Number of Moves total: " +  towersOfHanoi.getTotalMoves());
            }
        }   
    }
}
    
    

