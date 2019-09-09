/*
Chris Moroney
CS211 Livingston Section B (1:30)
Page 917 Exercises <3, 6, 8> (Page 879/880 exercises are on the word doc attached)
Due 13 May 2018
 */
package moroneychrishw05;
import java.util.*;
public class MoroneyChrisHW05 {

    public static void main(String[] args) {
        
        System.out.println("Chris Moroney");
        System.out.println("CS211 Livingston Section B (1:30)");
        System.out.println("Page 917 Exercises <3, 6, 8> (Page 879/880 exercises are on the word doc attached)");
        System.out.println("Due 13 May 2018");
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 3");
        System.out.println();
        System.out.println("This exercise requires us to copy a stack of integers and print it while still keeping the values in the original stack.");
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(34);
        s.push(53);
        s.push(2);
        s.push(14);
        s.push(12);
        s.push(84);
        s.push(13);
        s.push(10);
        System.out.println();
        System.out.println("This is the stack that will be inputed into the method: ");
        System.out.println(s);
        System.out.println();
        System.out.println("The following stacks show the duplicated stack (on the left) and the original stack (on the right)");
        System.out.print(copyStack(s) + " " + s);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 6");
        System.out.println();
        System.out.println("This exercise requires us to rearrange all of the integers in a queue so that all even numbers are in the front.");
        System.out.println();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(3);
        q.add(5);
        q.add(4);
        q.add(17);
        q.add(6);
        q.add(83);
        q.add(1);
        q.add(84);
        q.add(16);
        q.add(37);
        System.out.println("This is the queue of Integers that are inputed to the method: ");
        System.out.println(q);
        System.out.println();
        System.out.println("After going through the 'rearranging' process, the output of this method looks like this: ");
        rearrange(q);
        System.out.println(q);
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 8");
        System.out.println();
        System.out.println("This exercise requires us to determine whether or not a queue of integers is a palindrome or not.");
        System.out.println();
        
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(3);
        qu.add(8);
        qu.add(17);
        qu.add(9);
        qu.add(17);
        qu.add(8);
        qu.add(3);
        System.out.println("This is the queue of integers used in the isPalindrome method: ");
        System.out.println(qu);
        System.out.println();
        System.out.println("We can see that the queue of integers is in fact a palindrome, produced by this boolean");
        System.out.println(isPalindrome(qu));
        
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(3);
        que.add(17);
        que.add(9);
        que.add(4);
        que.add(17);
        que.add(3);
        System.out.println();
        System.out.println("However, let's use a different queue of integers: ");
        System.out.println(que);
        System.out.println();
        System.out.println("This queue is not a palindrome, and is shown by this boolean");
        System.out.println(isPalindrome(que));
    }
//HW05Ex03 -- create a copy of an original stack. The original must contain all of the previous values
    public static Stack<Integer> copyStack(Stack<Integer> original) {
        // stack to be copied onto
        Stack<Integer> newStack = new Stack<Integer>();
        // queue helps put values BACK into the original, as we need to keep them all in 
        Queue<Integer> queue = new LinkedList<Integer>();
            
        // while original is not empty, will remove values and put them into the newStack
        // reason -- since stacks follow remove data in a LIFO (last in first out) way, we need to put the data in, 
        // then transfer it into the queue
        while(!original.isEmpty()){
            newStack.push(original.pop());
        }   
        // while newStack is not empty, will remove values and put them into the queue
        // reasons -- the queue follows the FIFO way, which means first in first out, 
        // which will put in data that looks exactly like the original stack at first
        while(!newStack.isEmpty())
            queue.add(newStack.pop());
         
        //while queue is not empty, will take its values and put them both into the original and newStack
        // keep in mind that a queue is first in first out, which means that the first values inputed (being the last 
        // value in the newStack, which was the first value from the original) are identical to the original "original" 
        // stack
        while(!queue.isEmpty()) {
            int n = queue.remove();
            original.push(n);
            newStack.push(n);
        }
        return newStack;
    }
//Hw05Ex06 -- reaarange a queue so that the even integers in the queue are at the front, and odd at the back
    public static void rearrange(Queue<Integer> queue) {
        // create a stack for storage
        Stack<Integer> s = new Stack<Integer>();

        // from 0 to the size of the queue...
        for (int i = 0; i < queue.size(); i++){
            // this value is the value from the queue, taken away from the queue
            int n = queue.remove();
            // if the integer is odd
            if (n % 2 != 0){
                // put it in the storage and set back the for loop (to get all values)
                s.push(n);
                i--;
            // otherwise (meaning that it is even), just put it back into the queue
            } else {
                queue.add(n);
            }
        }
        // once the for loop closes, while the storage is not empty, will put values back into the queue
        while (!s.isEmpty()){
            int l = s.pop();
            queue.add(l);
        }
    }   
//HW05Ex08
    public static boolean isPalindrome(Queue<Integer> q) {
        // create a new stack for starage
        Stack<Integer> s = new Stack<Integer>();
        // initialize a boolean
        boolean confirmed = true;
        
        
        // from 0 to the size of the queue, we are essentially adding the value of the queue
        // back into the queue as well as to the stack in the 'front'
        
        // assume the queue looks like this: {1, 2, 3, 4}
        for(int i = 0; i < q.size(); i++) {
            int n = q.remove();
            // will look like this: (front) {1, 2, 3, 4} (back)
            q.add(n);
            // will look like this: (back) {1, 2, 3, 4} (front)
            s.push(n);
        }
        
        // from 0 to the queue size, we are "checking" to see there are any 'red flags' 
        // indicating that would show any non-matches in producing a palindrome
        for(int i = 0; i < q.size(); i++) {
            // this int is the front of a queue (which should match the back of a stack)
            int queueCheck = q.remove();
            // this int checks the front of a stack (which should match the back of a queue)
            int stackCheck = s.pop();
            // if there are any values that don't match, it is false
            if(queueCheck != stackCheck)
                confirmed = false;
            }
        // if the checks never hit false, will just return true
        return confirmed;
    }
}
