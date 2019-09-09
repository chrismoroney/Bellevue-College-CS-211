/*
Chris Moroney
CS211 Livingston Section B (1:30)
Hw07 Exercises <8, 12> Chapter 16, Exercises<1, 5, 8>, Chapter 17
Due 03 June 2018
IntList interface
 */

/*
 This is the interface definition for the IntList data type
 */
package moroneychrishw07;
public interface IntList {
    public int size();
    public int get(int index);
    public String toString();
    public int indexOf(int value);
    public void add(int value);
    public void add(int index, int value);
    public void remove(int index);
}
