/*
Chris Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
IntTreeNode Class
 */

// Class for storing a single node of a binary tree of ints
package moroneychrishw07;
public class IntTreeNode {
    
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;
                
    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                        
    // constructs a branch node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
