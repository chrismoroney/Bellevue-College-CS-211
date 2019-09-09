/*
Chris Moroney
CS 211 Livingston 1:30 (Section B)
Due 26 April 2018
In-Class Exercise
Tester and hasChain method
*/
package inclassexercisedominoes;


import java.util.*;   // for ArrayList

public class SolveDominoes {
    public static void main(String[] args) {
        // [(1|4), (2|6), (4|5), (1|5), (3|5)]
        List<Domino> dominoes = new ArrayList<Domino>();
        dominoes.add(new Domino(1, 4));
        dominoes.add(new Domino(2, 6));
        dominoes.add(new Domino(4, 5));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(3, 5));
        System.out.println(hasChain(dominoes, 5, 5));   // true
        System.out.println(hasChain(dominoes, 1, 5));   // true
        System.out.println(hasChain(dominoes, 1, 3));   // true
        System.out.println(hasChain(dominoes, 1, 6));   // false
        System.out.println(hasChain(dominoes, 1, 2));   // false
    }
    
    public static boolean hasChain(List<Domino> dominoes,
        int start, int end) {if (start == end) {
            return true;                         // base case
        } else {
            for (int i = 0; i < dominoes.size(); i++) {
                Domino d = dominoes.remove(i);   // choose
                if (d.getFirstSide() == start) {        // explore
                    if (hasChain(dominoes, d.getSecondSide(), end)) {
                        return true;
                    }
                } else if (d.getSecondSide() == start) {
                    if (hasChain(dominoes, d.getFirstSide(), end)) {
                        return true;
                    }
                }
                dominoes.add(i, d);              // un-choose
            }
            return false;
        }
    }
}
