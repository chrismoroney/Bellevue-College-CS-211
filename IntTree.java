/*
Chris Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
IntTree class 
 */

// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder or postorder traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."

package moroneychrishw07;
import java.util.*;

public class IntTree {
    private IntTreeNode overallRoot;

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    //       nodes
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless
    //       n is greater than max, in which case it returns an
    //       empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints the tree contents using a preorder traversal
    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
    
// I found out that I needed to write a public method that doesn't call on anything
// then make a private method that is able to use the private IntTreeNode that is used
// from this class, just as the other methods are created in this class

// HW07Ex01 -- write a method that counts the number of LeftNodes there are in an Int Tree
    public int countLeftNodes(){
        // recursively return the int value from the class that calls on the 
        // private IntTreeNode
        return countLeftNodes(overallRoot);
    }
    // the private method that is able to take in the IntTreeNode
    private int countLeftNodes(IntTreeNode node){
    	// initialize a total count
        int total = 0;
        
        // best to keep in mind... if overallRoot is empty, it will automatically
        // return zero because the total is zero.

        // if the node on the left of the overallRoot node (root) is not empty ...
        if (node.left != null){
            // then the total left nodes on the LEFT SIDE of the overallRoot is 1 + however many
            // times the countLeftNodes will return. This is because the first check of left
            // nodes is on the left, so we can add to the total by the number of times
            // we go to the left by one because we started by going to the left. Once it is empty,
            // the count will stop
            total += countLeftNodes(node.left) + 1;
        } 
        // if the node on the right of the the overallRoot node (root) is not empty...
        if (node.right != null){
            // then the total left nodes on the RIGHT SIDE of the overallROot
            // is just how many children there are that can go leftward after
            // going to the right. Will stop counting if there are no more 
            // nodes to count
            total += countLeftNodes(node.right);
        }
        // return the value that we have counted in the program.
    return total;    
    }
// Hw07Ex05 -- write a method that prints the node values, one per line
//             at a level provided by an inputed level
    public void printLevel(int level){
        // if the inputed number is less than or equal to zero...
        if (level <= 0){
            // then the level on the IntTree does not exist, throw an exception
            throw new NoSuchElementException();
        // otherwise...
        } else {
            // initialize this variable, will be used later, but this number tells
            // the private method to start on the leftmost node.
            int leftMostNode = 1;
            // recursively call upon the method itself, that private inputs these
            // 
            printLevel(overallRoot, level, leftMostNode);
        }
    }
    // The private method that is recursively called by the public method above.
    
    // notice the input variable names ... i called overallRoot node because we are 
    // changing nodes as we analyze them. I change level into levelInput, simply just 
    // to make more sense out of the int. Finally I changed leftMostNode into 
    // sweeper, because we are more "sweeping" across the levelInput to get all of our
    // nodes in the level.
    
    // I used recursion to be able to determine all the numbers because we are 
    // grabbing pieces of data that can be achieved through the same method
    private void printLevel(IntTreeNode node, int levelInput, int sweeper){
        // if the node we currently on is NOT empty (starting at the root)...
        if (node != null){
            // then check the levelInput and sweeper values, if they are equal, then the 
            // recursion process ends, print ther last node value, one value per line.
            if (levelInput == sweeper){
                System.out.println(node.data);
            // otherwise if the sweeper is less than the levelInput (which it will be since
            // we put sweeper starting at 1) ...
            } else {
                // then run recursion on both the left and right (starting on left)
                
                // starting on the left, it will keep CLIMBING DOWN the tree by 
                // tracing the node on the left. If recursion starts by going left, it will
                // keep tracing to the left until sweeper and levelInput are equal. That is how
                // the program will know how to stop. When recursion down the left
                // branch is finished, then the node to the right of the node will begin, 
                // then trace down starting to the left, and then the right until levelInput and 
                // sweeper are equal. 
                printLevel(node.left, levelInput, sweeper + 1);
                printLevel(node.right, levelInput, sweeper + 1);
            }
        }
    }
// Hw07Ex08 -- write a toString method for the IntTree
    // the public method, this is what will be called from the main client.
    public String toString() {
        // recursively return a method of itself (from the private method) while inserting
        // the overallRoot inside.
        return toString(overallRoot);
    }
    // the private method, this is how the String will be made while inputting the 
    // IntTree that we need.
    public String toString(IntTreeNode node) {
        // if the node that we are currently on is empty, we need to return a string
        // called "empty".
        if (node == null) {
            return "empty";
        // if the node on the left and right are empty, then we just need to return
        // the value of that node, followed by a space, so that we can show 
        // what else is in the particular branch or level of the IntTree (such as 4, 8, 9 in the provided tree
        // in the main client). 
        } else if (node.left == null && node.right == null) {
            return node.data + "";
        // in all other cases (will pertain to when there are nodes that have a left and right node value)...
        // we need to print out all of the nodes, and how they are connected in the branch, using
        // parentheses and the values of the node values. Then we have to recursively send the nodes to the left and 
        // right of the current node, get their values, and then insert them into the string. 
        // When all of the recursion is done, there will be multiple sets of parenthesis sets
        // that contain many wrapped sets of nodes inside of parentheses. 
        } else {
            return "(" + node.data + ", " + toString(node.left) + ", " + toString(node.right) + ")";
        }
    }
}