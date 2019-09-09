/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
Homework #6 -- Exercises <1, 2, 5, 8, 11> Page 961 
Due 20 May 2018
ArrayIntList class
 */


package moroneychrishw06;
import java.util.*; // for the NoSuchElementException() in Exercise 11
// Class ArrayIntList can be used to store a list of integers.

public class ArrayIntList {
    private int[] elementData; // list of integers
    private int size;          // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    // post: constructs an empty list of default capacity
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    // pre : capacity >= 0
    // post: constructs an empty list with the given capacity
    public ArrayIntList(int capacity) {
        elementData = new int[capacity];
        size = 0;
    }   

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return elementData[index];
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // pre : size() < capacity
    // post: appends the given value to the end of the list
    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    // pre: size() < capacity && 0 <= index <= size()
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, int value) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }
    
// HW06Ex01 -- write a method called lastIndexOf that returns the index of a number on its last occurance
//          -- returns 21 if not found
    public int lastIndexOf(int finder){
        // initizalize returnVal for 21 in case it can't be found, then it will just be returned
        int returnVal = 21;
        // for all numbers in the ArrayIntList
        for(int i = 0; i < size; i++){
            // if the value at index i in the ArrayIntList is found...
            if(get(i) == finder){
                // then set it to that index (i) value. If there is more than one, it will
                // reset the i to the next i value
                returnVal = i;
            }
        }
        return returnVal;
    }
// HW06Ex02 -- write a method called indexOfSubList that takes in another ArrayIntList and 
//          -- finds the first occurance of this list in the original ArrayIntList.
//          -- will return 21 if not found at all
    public int indexOfSubList(ArrayIntList l){
        // initialize returnVal as 21 in case nothing happens
        int returnVal = 21;
        // initialize a boolean which will help us determine when to "break" the for loop
        boolean bFound = false;
        // this is saying if the size of the sub-ArrayIntList inputed is larger than the original,
        // just return 21. This will help prevent crashes in the program (in case the input is larger
        // than what is being compared). 
        if(l.size() > this.size()){
            returnVal = 21;
            
        // In all other cases:
        } else {
            // we will take all values of the length of the original ArrayIntList subtracted
            // by the length of the size of the input. This is because there is no need 
            // to keep checking numbers beyond the size of the inputed ArrayIntList, simply because 
            // the desired input won't be found in the original. 
            for (int i = 0; i < size - l.size(); i++){
                // if the first term of the input matches the value at i for the original AND
                // the boolean is not true (which it is)...
                if (this.get(i) == l.get(0) && (!bFound)){
                    // ... then begin counting the values from 0 to the length of the input and compare it all
                    for (int j = 0; j < l.size(); j++){
                        // if all values match from 0 to the length of the input
                        if (this.get(i + j) == l.get(j)){
                            // boolean becomes true
                            bFound = true;
                        
                        // if there is one mismatch, the boolean is false and will break the for loop and try again
                        } else {
                            bFound = false;
                            break;
                        }
                    }
                    // if the boolean is true throughout all of the above, it will return the first instance, which
                    // is at index i
                    if(bFound){
                        returnVal = i;
                    }
                }
            }
        }
        // returning the first instance of finding the inputed sub-ArrayIntList
        return returnVal;
    }
// HW06Ex05 -- write a method that returns a new ArrayIntList of values that keeps a running total to the "i"th value
    public ArrayIntList runningTotal(){
        // we need to create a NEW ArrayIntList, the size must be the same because we will 
        // be adding values to eachother from the old list, requiring the list to be the same.
        ArrayIntList returner = new ArrayIntList(this.size);
        
        // this is our fencepost to start. We need to add at index 0 the value
        // that is at index 0. This makes sense because there is nothing being added
        // to this value
        returner.add(0, this.get(0));
        
        // for all values from index ONE (1) til the end of the ArrayIntLIst
        for (int i = 1; i < size; i++){
            // we need to add all the values to index i the value of the original ArrayIntList 
            // added by its previous value, which we store in the new ArrayIntList. If the value doesn't come from the returner list,
            // then we are adding valus that aren't a running total, but moreover its original value
            returner.add(i, (this.get(i) + returner.get(i - 1)));
        }
        // returning the new ArrayList when it is filled
        return returner;
    }
// HW06Ex08 -- wrtie a method that counts the number of times a value appears in an ArrayIntList
    public int count(int tester){
        // initialize the returnVal, currently at 0 because we haven't begun counting yet
        int returnVal = 0;
        // for all indexes from 0 to the size of the ArrayIntList
        for (int i = 0; i < size; i++){
            // if the value at the index matches the int inputed ...
            if (this.get(i) == tester){
                // returnVal increases by one
                returnVal++;
            }
        }
        // returning the amount of times an inputed number appears in an ArrayIntList
        return returnVal;
    }
// Hw06Ex11 -- write a method that returns the last value of an ArrayIntList and removes it
    public int removeLast(){
        // initialize the returning value, which is known as removeVal because we want 
        // to also remove that value
        int removeVal = 0;
        // if the size of the ArrayIntList is zero...
        if (size == 0){
            // throws a new NoSuchElementException
            throw new NoSuchElementException();
        // for all other cases
        } else {
            // we set the removeVal equal to the value at the very back of the ArrayIntList
            removeVal = elementData[size - 1];
            // we also remove this element from the ArrayIntList altogether
            this.remove(size - 1);
        }
        // returning the value of the very last index in the ArrayIntList, which is also removed from the ArrayIntList itself.
        return removeVal;
    }
}
