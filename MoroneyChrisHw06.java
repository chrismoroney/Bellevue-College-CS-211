/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
Homework #6 -- Exercises <1, 2, 5, 8, 11> Page 961 
Due 20 May 2018
Test Client
 */
package moroneychrishw06;
public class MoroneyChrisHw06 {

    public static void main(String[] args) {
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Mr. Livingston Section B (1:30)");
        System.out.println("Homework #6 -- Exercises <1, 2, 5, 8, 11> Page 961 ");
        System.out.println("Due 20 May 2018");
        System.out.println("This homework is all about implementing a collection class, which is demonstrated through an ArrayIntList");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 1");
        System.out.println();
        System.out.println("This exercise requires us to return an int value of the index where a value last occurs. Otherwise, it returns 21");
        System.out.println();
        System.out.println("Let's suppose we set the desired number to '18'");
        System.out.println();        
        ArrayIntList list = new ArrayIntList(8);
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);
        System.out.println("This is the ArrayIntList we will use to find the last instance of the desired number: ");
        System.out.println(list);
        System.out.println();
        System.out.println("The desired number last appears at this index: ");
        System.out.println(list.lastIndexOf(18));
        System.out.println();
        System.out.println("This is correct, as 18 appears in index 1, 4, and 6. However, the last value is located at index 6");
        System.out.println();
        System.out.println("However, if the desired number is '49'...");
        System.out.println();
        System.out.println("What we end up getting back as a return value from the same ArrayIntList is: ");
        System.out.println(list.lastIndexOf(49));
        System.out.println();
        System.out.println("Since 49 does not appear at all in the ArrayIntList, the index that is returned is 21. This is correct.");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 2");
        System.out.println();
        System.out.println("This exercise requires us to find the index of the first instance where a sub-ArrayIntList appears in an original ArrayIntList.");
        System.out.println("If the sub-ArrayIntList is not found, then we should get back 21.");
        System.out.println();
        
        ArrayIntList list1 = new ArrayIntList(9);
        ArrayIntList list2 = new ArrayIntList(3);
        list1.add(11);
        list1.add(-7);
        list1.add(3);
        list1.add(42);
        list1.add(0);
        list1.add(14);
        list1.add(3);
        list1.add(42);
        list1.add(0);

        list2.add(3);
        list2.add(42);
        list2.add(0);
        
        System.out.println("This is what our original ArrayIntList looks like: ");
        System.out.println(list1);
        System.out.println();
        System.out.println("This is the ArrayIntList that we will use to compare a sub-ArrayIntList to.");
        System.out.println();
        System.out.println("The sub-ArrayIntList that we want to find in the original is this: ");
        System.out.println(list2);
        System.out.println();
        System.out.println("We can see that there are two instances of the sub-ArrayIntList in the original ArrayIntList. ");
        System.out.println("However, we only want the index of the first instance, starting at where the first value of the index is.");
        System.out.println();
        System.out.println("The location where the first instance of the sub-ArrayIntList appears at this index:");
        System.out.println(list1.indexOfSubList(list2));
        System.out.println();
        System.out.println("This is correct because the first instance of this sub-ArrayIntList begins at index 2");
        
        list2.remove(42);
        list2.add(2, 2);
        
        System.out.println();
        System.out.println("Suppose we change the sub-ArrayIntList to this: ");
        System.out.println(list2);
        System.out.println();
        System.out.println("This sub-ArrayIntList does not appear anywhere in the original, so the returning value should be 21");
        System.out.println(list1.indexOfSubList(list2));
        System.out.println();
        System.out.println("This is correct.");

        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 5");
        System.out.println();
        System.out.println("This exercise requires us to return a new ArrayIntList that keeps a running total of each value in an original ArrayIntList.");
        System.out.println();
        System.out.println("Suppose this is the ArrayIntList that we are using for the runningTotal method: ");
        System.out.println(list);
        System.out.println();
        System.out.println("We need this ArrayIntList to add the previous terms by itself to be the next term at the next index. ");
        System.out.println();
        System.out.println("The new ArrayIntList would look like this: ");
        System.out.println(list.runningTotal());
        System.out.println();
        System.out.println("To show that I did not change the original ArrayIntList, I can pring both ArrayIntLists together");
        System.out.println("Original: " + list);
        System.out.println("New: " + list.runningTotal());
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 8");
        System.out.println();
        System.out.println("This exercise requires us to return an int determining the number of times a value appears in an ArrayIntList");
        System.out.println();
        System.out.println("Let us use this ArrayIntList for counting on: ");
        ArrayIntList list3 = new ArrayIntList(8);
        list3.add(2);
        list3.add(-3);
        list3.add(2);
        list3.add(0);
        list3.add(5);
        list3.add(2);
        list3.add(2);
        list3.add(4);
        System.out.println(list3);
        System.out.println();
        System.out.println("Suppose we want to count the number of times that the number '2' shows up");
        System.out.println();
        System.out.println("We can see that 2 appears a lot in the ArrayIntList. The exact number of times it shows up is: ");
        System.out.println(list3.count(2));
        System.out.println();
        System.out.println("If we count the number of times 0 is in the ArrayIntList, we will see it shows up this number of times: ");
        System.out.println(list3.count(0));
        System.out.println();
        System.out.println("If we count the number of times 15 shows up, which is not in the ArrayIntList, we will get: ");
        System.out.println(list3.count(15));
        System.out.println();
        System.out.println("All of these values are correct.");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 11");
        System.out.println();
        System.out.println("This exercise requires us to return the value of the last index in an ArrayIntList, and then remove that value from the ArrayIntList.");
        System.out.println();
        System.out.println("Suppose we start with this ArrayIntList: ");
        
        ArrayIntList list4 = new ArrayIntList(5);
        
        list4.add(8);
        list4.add(17);
        list4.add(42);
        list4.add(3);
        list4.add(8);
        System.out.println(list4);
        System.out.println();
        System.out.println("The last value in this ArrayIntList is: ");
        System.out.println("8");
        System.out.println();
        System.out.println("We can remove this value using our method. It will look like this: ");
        
        System.out.println("Last Value from ArrayIntList above: " + list4.removeLast());
        System.out.println("Modified ArrayIntList: " + list4);
        System.out.println();
        System.out.println("We can continue doing this until there are no more values in the ArrayIntList. ");
        System.out.println();
        for (int i = list4.size(); i > 0; i--){
            System.out.println("Last Value from ArrayIntList above: " + list4.removeLast());
            System.out.println("Modified ArrayIntList: " + list4);
            System.out.println();
        }
        System.out.println("The last values are all correct, as well as all of the modified ArrayIntLists.");
    }
    
}
