
/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
In Class Exercise #5 
Due 18 May 2018
Provided Interface

 This is the interface definition for the IntList data type
 */
package inclassexercise.pkg05;

public interface IntList {
    public int size();
    public int get(int index);
    public String toString();
    public int indexOf(int value);
    public void add(int value);
    public void add(int index, int value);
    public void remove(int index);
}
