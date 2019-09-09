/*
Chris Moroney
Livingston CS211 Section B
Due 23 May 2018
In Class Exercise Number 6
Test Client
*/

package inclassexercise.pkg6;
// This program tests the IntSearchTree class by constructing a
// binary search tree of integers and printing its contents as
// well as its structure.

import java.util.*;

public class IntSearchTreeClient {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        IntSearchTree numbers = new IntSearchTree();
        
        Random r = new Random();
        for (int i = 0; i < 16; i++) {
            numbers.add(r.nextInt(50) + 1);
        }
                
        System.out.print("Next int (0 to quit)? ");
        int number = console.nextInt();
        while (number != 0) {
            numbers.add(number);
            System.out.print("Next int (0 to quit)? ");
            number = console.nextInt();
        }
        System.out.println();
        

        System.out.println("Tree Structure:");
        numbers.printSideways();
        System.out.println("Sorted list:");
        numbers.print();
        if (numbers.contains(1000)) {
            System.out.println("A strange event!");
        } else {
            System.out.println("World is alright!");
        } 
        System.out.println("minimum value:");
        System.out.println(numbers.getMin());
    }
}
