/*
Chris Moroney
CS 211 Livingston Section B (1:30)
HW8 Chapter 18 Exercises <1, 2, 3, 9, 11>
Due 10 June 2018
Test Client and Methods for HeapIntPriorityQueue
 */
package moroneychrishw08;

import java.util.Stack;
public class MoroneyChrisHw08 {

    public static void main(String[] args) {
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Livingston Section B (1:30)");
        System.out.println("HW8 Chapter 18 Exercises <1, 2, 3, 9, 11>");
        System.out.println("Due 10 June 2018");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 1");
        System.out.println();
        System.out.println("Write a method that adds all of the elements from one other HashSet to another if the values are not equivalent. ");
        System.out.println();
        System.out.println("Suppose we use the following HashIntSets to add together...");
        System.out.println();
        HashIntSet set = new HashIntSet();
        set.add(-5);
        set.add(1);
        set.add(2);
        set.add(3);

        HashIntSet set2 = new HashIntSet();
        set2.add(2);
        set2.add(3);
        set2.add(6);
        set2.add(44);
        set2.add(79);
        System.out.println("HashIntSet 1 : " + set);
        System.out.println("HashIntSet 2 : " + set2);
        
        System.out.println();
        System.out.println("We can see here that the duplicates include 2 and 3. Those values will only appear once, just like everything else.");
        System.out.println();
        System.out.println("The final result looks like this: ");
        set.addAll(set2);
        System.out.println(set);
        System.out.println();
        System.out.println("Success!");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 2");
        System.out.println();
        System.out.println("Write a method that determines whether or not a smaller HashSet can be found entirely inside of the other HashSet.");
        System.out.println();
        System.out.println("Suppose the 'larger' HashSet is the following: ");
        HashIntSet set3 = new HashIntSet();
        set3.add(3);
        set3.add(6);
        set3.add(8);
        
        HashIntSet set4 = new HashIntSet();
        set4.add(-2);
        set4.add(3);
        set4.add(5);
        set4.add(6);
        set4.add(8);
        System.out.println(set4);
        
        System.out.println();
        System.out.println("Now, suppose the smaller HashSet looks like this: ");
        System.out.println(set3);
        System.out.println();
        System.out.println("Our method will determine whether or not all of the smaller hashSet's number can be found inside of the larger Hashset.");
        System.out.println(set4.containsAll(set3));
        System.out.println();
        System.out.println("The method tells us that it is true, which is correct because the numbers 3, 6 and 8 are inside of the larger HashSet.");
        System.out.println();
        set3.remove(3);
        set3.add(2);
        System.out.println("Now, suppose the smaller hashSet looks like this:");
        System.out.println(set3);
        System.out.println();
        System.out.println("Clearly, there is no 2 found inside of the larger HashSet, so the method should return false");
        System.out.println(set4.containsAll(set3));
        System.out.println();
        System.out.println("Success!");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 3");
        System.out.println();
        System.out.println("Write a method that determines whether or not an inputed HashSet is completely equal to the other. ");
        System.out.println();
        System.out.println("Suppose the two HashSets we are comparing are the following: ");
        System.out.println();
        System.out.println("HashIntSet 1: " + set3);
        System.out.println("HashIntSet 2: " + set4);
        System.out.println();
        System.out.println("These two Sets are clearly not the same, even though one list contains all of the numbers inside of the Set. ");
        System.out.println("For this, we should be getting false in return.");
        System.out.println();
        System.out.println(set3.equals(set4));
        System.out.println();
        System.out.println("This is correct.");
        System.out.println();
        System.out.println("Now suppose that we change the second set to this: ");
        set3.remove(2);
        set3.add(3);
        set3.add(-2);
        set3.add(5);
        System.out.println("HashIntSet 2: " + set3);
        System.out.println();
        System.out.println("These lists contain the same values, so the result should be true. ");
        System.out.println();
        System.out.println(set3.equals(set4));
        System.out.println();
        System.out.println("Success! ");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 9");
        System.out.println();
        System.out.println("Write a method that returns the kth smallest value in a Priority Queue, input a Priority Queue and int k.");
        System.out.println();
        System.out.println("Suppose we are using the following Priority Queue: ");
        System.out.println();
        HeapIntPriorityQueue thisQueue = new HeapIntPriorityQueue();
        //42, 50, 45, 78, 61
        thisQueue.add(42);
        thisQueue.add(50);
        thisQueue.add(45);
        thisQueue.add(78);
        thisQueue.add(61);
        System.out.println(thisQueue);
        System.out.println();
        System.out.println("Also, suppose we are using the following k number: ");
        System.out.println("3");
        System.out.println();
        System.out.println("This means that inside of the Priority Queue, we need to find the 3rd smallest value (which should be 50). ");
        System.out.println();
        System.out.println("The following is the third smallest value from the method: ");
        System.out.println(kthSmallest(thisQueue, 3));
        System.out.println();
        System.out.println("Suppose now we change the k value to 4, we should get 61. This is the answer: ");
        System.out.println(kthSmallest(thisQueue, 4));
        System.out.println();
        System.out.println("Success!");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 11");
        System.out.println();
        System.out.println("Write a method that removes all duplicate values in a priority queue.");
        System.out.println();
        System.out.println("Suppose we use the following Priority Queue of Integers: ");

        HeapIntPriorityQueue duplicatesQueue = new HeapIntPriorityQueue();
        // [7, 7, 8, 8, 8, 10, 45, 45],
        duplicatesQueue.add(7);
        duplicatesQueue.add(7);
        duplicatesQueue.add(8);
        duplicatesQueue.add(8);
        duplicatesQueue.add(8);
        duplicatesQueue.add(10);
        duplicatesQueue.add(45);
        duplicatesQueue.add(45);
        
        System.out.println(duplicatesQueue);
        System.out.println();
        System.out.println("If we remove the Duplicates from this queue, we should only have one 7, 7, 10, and 45. ");
        System.out.println();
        System.out.println("This is the result of our new Queue: ");
        removeDuplicates(duplicatesQueue);
        System.out.println(duplicatesQueue);
        System.out.println();
        System.out.println("Success! ");
        
    }
//HW08Ex09 -- write a method that returns the kth smallest value in a Priority Queue, input a Priority Queue and int k
    
    public static int kthSmallest(HeapIntPriorityQueue pq, int k){
        // if k is 0, negative, or larger than the Priority Queue size...
        if (k <= 0 || k > pq.size()){
            // throw IllegalArgumentException
            throw new IllegalArgumentException();
        // otherwise...
        } else {
            // initialize a return val
            int returnVal = 0;
            // use a standard Java stack for storage (last in, first out)
            Stack storage = new Stack();
            // for all values between 0 and k...
            for(int i =  0; i < k; i++){
                // remove the value and set it equal to returnVal
                returnVal = pq.remove();
                // put this value into the storage
                storage.push(returnVal);
            }
            // Since we need the Priority Queue to remain in its original state, we must
            // put all of the removed values back in. We keep returnVal's value the same, but 
            // use x to put the values back in.
            
            //while the storage is not empty...
            while (!storage.isEmpty()){
                //set the x equal to the front of the stack
                int x = (int) storage.pop();
                // add it back into the priority queue
                pq.add(x);
            }
        // return the value that we removed a number of times from the priority queue.
        return returnVal;
        }
    }  
//HW08Ex11 -- write a method that removes all duplicate values in a priority queue.
    public static void removeDuplicates(HeapIntPriorityQueue pq){
        // use a stack as storage for values
        Stack storage = new Stack();
        // while priority queue is not empty...
        while(!pq.isEmpty()){
            // set the x value equal to the front value and remove it
            int x = pq.remove();
            // if the priority queue is not empty at this point
            if(!pq.isEmpty()){
                // set y equal to the next value at the front, without removing it
                int y = pq.peek();
                // compare x and y. If they are different...
                if(x != y){
                    // then put the removed value in the storage. Otherwise, throw it away.
                    storage.push(x);
                }
            // we only get to this point if there is no numbers remianing. If the priority queue
            // is empty...
            } else {
                // put the last remove value inside.
                storage.push(x);
            }  
        }
        // now we have the storage, and an empty priority queue. We just need to put the values
        // inside the priority queue.
        // while priority queue is not empty...
        while (!storage.isEmpty()){
            // set its value equal to the front of the storage, and remove it
            int replace = (int) storage.pop();
            // add the value to the priority queue.
            pq.add(replace);
        }
        
    }
}
