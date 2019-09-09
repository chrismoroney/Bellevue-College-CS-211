/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
In Class Exercise #5
Due 18 May 2018
LinkedIntList class
 */
package inclassexercise.pkg05;

// need this for the exception in the inclassexercise
import java.util.*;

// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList implements IntList {
    private ListNode front;  // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current !=  null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // In Class Exercise #4 -- write a method that returns the minimum value in a list of integers.
    public int min() {
        // if the list is empty...
        if (front == null) {
           
            // throw an exeption
            throw new NoSuchElementException();
        
        } else {
            // the piece of data that we are on and comparing to the min.
            ListNode index = front.next;
            
            // min is initialized as the first value in the list, acts as a fencepost
            int returnVal = front.data;
            
            // while there are still values in the list, or the 'next' value is not null
            while (index != null) {
                
                // if the data that we are speculating through the node is less than our current min ... 
                if (index.data < returnVal) {
                    
                    // set the min to that int value from the list
                    returnVal = index.data;
                }
                // regardless of what happens, the node is shifted to the next integer in the list to be compared
                index = index.next;
            }
            // return the minimum value in the list of integers
        return returnVal;
        }
    }
    
    // In Class Exercise #5
    public void moveToBack(){
        // if the size of the list is less than or equal to one
        if(size() <= 1){
            // do nothing
        } else {
            // int value is the first term in the list. We add it to the back, and then remove the term
            // at index 0
            int value = get(0);
            add(value);
            remove(0);
        }
    }

}
