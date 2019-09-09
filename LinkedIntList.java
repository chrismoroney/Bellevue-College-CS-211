/*
Chris Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
LinkedIntList Class
 */

// Class LinkedIntList can be used to store a list of integers.
package moroneychrishw07;

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
// HW07Ex08 -- write a method that switches the Node values next to eachother in index (switch every pair).
    public void switchPairs() {
        // reference a ListNode right now, so that it isn't constantly changing
	ListNode current = front;
        // for all values that are only half of the size of the LinkedIntList...
        for(int i = 0; i < size() / 2; i++) {
            // initialize two variables, one for the node value currently and one for the next node value 
            int currentNum = current.data;
            int nextNum = current.next.data;
            // switch the values of these two variables
            current.data = nextNum;
            current.next.data = currentNum;
            // set the current ListNode over two spaces, this is why we only need
            // to go through half of the LinkedIntList in the for loop
            current = current.next.next;
        }
    }
// HW07Ex12 -- write a method that places all negative values in an LinkedIntList
//             before the positive values
    
//          -- was an EXTREMELY hard problem in my opinion, which is why I have lots of comments to walk through my thinking
    public void split(){
        // initialize four ListNodes. One for determining which ListNode we are on right now
        ListNode current = front;
        // one for determining at the end if there are any more negative numbers to go ahead
        ListNode noMore = null;
        // one for determining the "positive" numbers and their control and sequence
        ListNode numPositive = null;
        // one for determining the "negative" numbers and their control and sequence.
        // of the positive numbers.
        ListNode numNegative = null;
        // while the current node we are on is not null...
        while(current != null) {
            // initialize a ListNode called nextNode, which is ALWAYS the next node to current
            // This is why we initialize this variable here, not above with the rest.
            // This is extremely important because the sequence of all numbers are not
            // always going to stay consistent, there will be a lot of null areas. 
            // If we have this though, we will have our next value always.
            ListNode nextNode = current.next;
            // if the node value at this current node is positive...
            if(current.data >= 0) {
                // then we switch the values of the numPositive (which is null) and that of the next position.
                // this causes the next position of current to be null, and isPositive to be whatever
                // the positive value of the node was.
                current.next = numPositive;
                numPositive = current;  
            // however if the node value at the current node is negative...
            } else if (current.data < 0){
                // then we switch the values of the numNegative (which is null) and that of the next position.
                // this causes the next position of current to be null, and isPositive to be whatever
                // the positive value of the node was. Following this pattern will create a chain of negative values, which ends or starts
                // with a null value, depending on the LinkedIntList.
                current.next = numNegative;
                numNegative = current;
                // this initiates which negative value will be the "last" one. The node value after
                // this node will be null, which assists in ending the method (in my list, is is -895).
                // In other words, once we initiate the noMore, that means that once we present this number
                // we don't have anymore negative numbers. 
                if(numNegative.next == null)
                    noMore = numNegative;
            }
            // this pushes the current to the next node in the LinkedIntList, which returns back to the
            // while loop.
            current = nextNode;
        }
        // so long as numNegative is not null...
        if(numNegative != null) {
            // the "null" part initiated from above with the positive numbers is not the end of the sequence
            noMore.next = numPositive;
            // the front of the list is now forced to be negative numbers, based on the else if above.
            front = numNegative;
        }
        // if there were NO negative numbers, then the if loop above wouldn't work, and
        // would just print positive numbers
    }   
}
