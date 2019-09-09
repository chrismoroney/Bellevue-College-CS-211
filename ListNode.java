/*
Chriw Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
ListNode Class
 */

// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.
package moroneychrishw07;
public class ListNode {
    public int data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
