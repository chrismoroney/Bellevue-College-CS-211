/*
Chris Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
Test Client 
 */
package moroneychrishw07;


public class MoroneyChrisHw07 {

    public static void main(String[] args) {
        System.out.println("Chris Moroney");
        System.out.println("CS211 Livingston Section B (1:30)");
        System.out.println("Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17");
        System.out.println("Due 03 June 2018");
       
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        System.out.println("Chapter 16, Exercise 8");
        System.out.println();
        System.out.println();
        System.out.println("In this exercise, we need to switch every other node value in the LinkedIntList with the other.");
        LinkedIntList test = new LinkedIntList();
        System.out.println();
        System.out.println("For example, suppose we have this LinkedIntList: ");
        test.add(14);
        test.add(18);
        test.add(6);
        test.add(2);
        test.add(856);
        test.add(26);
        test.add(132);
        test.add(6432);
        System.out.println(test);
        System.out.println();
        System.out.println("When we use the method to switch every pair of node values, the result of the sorted LinkedIntList is this: ");
        test.switchPairs();
        System.out.println(test);
        System.out.println();
        System.out.println("If we use the method again on this new, sorted LinkedIntList, we should get the ORIGINAL LinkedIntList back: ");
        test.switchPairs();
        System.out.println(test);
        System.out.println("We can see that we get the original LinkedIntList, so the method works!");
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Chapter 16, Exercise 12");
        System.out.println();
        System.out.println();
        System.out.println("In this exercise, we need to sort the LinkedIntList so that all negative values appear before positive values.");
        System.out.println();
        System.out.println("Suppose we use the follow LinkedIntList");
        LinkedIntList test1 = new LinkedIntList();
        
        test1.add(5);
        test1.add(80);
        test1.add(-895);
        test1.add(-4);
        test1.add(8);
        test1.add(-3);
        test1.add(-89);
        test1.add(7);
        test1.add(90);
        System.out.println(test1);
        System.out.println();
        System.out.println("If we use the method we created, the node values in index 2, 3, 5, and 6 should now appear in 0, 1, 2, and 3. ");
        System.out.println("In other words, we should expect to see the negative values at the beginning, like this: ");
        test1.split();
        System.out.println(test1);
        System.out.println();
        System.out.println("As we can see, we now have all of the negative values in the beginning of the LinkedIntList, so our method worked! ");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("For all of the Chapter 17 exercises, we are going to be using this IntTree: ");
        System.out.println();
        IntTree t = new IntTree(15);
        
        System.out.println("Tree structure:");
        t.printSideways();
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Chapter 17, Exercise 1");
        System.out.println();
        System.out.println();
        System.out.println("In this excericse, we need to count the number of left Nodes there are in the IntTree above");
        System.out.println();
        System.out.println("We can see from the Tree, that even though it is printed out sideways, the root is located where the node value is equal to 1.");
        System.out.println();
        System.out.println("We can see that the following numbers are left Nodes children to the IntTree: ");
        System.out.println("2, 4, 6, 8, 10, 12, 14 ");
        System.out.println();
        System.out.println("The method does not demonstrate WHICH numbers are leftNodes, but shows how MANY left nodes there are in the IntTree: ");
        System.out.println(t.countLeftNodes());
        System.out.println();
        System.out.println("We can see that there are in fact this many left Nodes, meaning that the method worked! ");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Chapter 17, Exercise 5");
        System.out.println();
        System.out.println();
        System.out.println("In this exercise, we need to print the node values in a level, determined by an inputed int value representing the level of the IntTree.");
        System.out.println();
        System.out.println("Suppose that the desired level we want to print the node values in level 3.");
        System.out.println();
        System.out.println("The node values in the third level are 4, 5, 6, and 7, which is shown down below: ");
        System.out.println();
        t.printLevel(3);
        System.out.println();
        System.out.println("We can see that these are all of the node values at the third level, so the method works! ");
        System.out.println();
        System.out.println("Now, lets change the level to the fourth level.");
        System.out.println();
        System.out.println("We can see that there are many more nodes in the fourth level from the IntTree. ");
        System.out.println("If we use the method on level 4, it will print out these node values: ");
        System.out.println();
        t.printLevel(4);
        System.out.println();
        System.out.println("The values here are correct, and so the method still works! ");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Chapter 17, Exercise 8");
        System.out.println();
        System.out.println();
        System.out.println("In this exercise, we need to demonstrate what a toString method looks like with the tree provided. ");
        System.out.println();
        System.out.println("It will be hard to interpret entirely what the following will compare to the tree, but this is what it will look like: ");
        System.out.println();
        System.out.println(t.toString());
        System.out.println();
        System.out.println("We can see here that the number each grouping of parenthesis demonstrates a certain section.");
        System.out.println("The first number in each grouping is the 'center' node between two lower children. ");
        System.out.println();
        System.out.println("For instance, the very first number that appears is the 1, and that is the root over all other nodes. ");
        System.out.println();
        System.out.println("Following each set of first numbers (parenthesis followed by a number), the second number is the left child, and ");
        System.out.println("the third number the right child node.");
        System.out.println();
        System.out.println("For instance, the 4 is the mini-root between numbers 8 and 9, which are the left and right children.");
        System.out.println();
        System.out.println("Keep in mind, upper level numbers also serve as smaller roots to the larger root, which is why there is a lot of parentheses. ");
        System.out.println();
        System.out.println("All of our statements are correct, so the method works! ");
        
    }
    
}
