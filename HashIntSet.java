/*
Chris Moroney
CS 211 Livingston Section B (1:30)
HW8 Chapter 18 Exercises <1, 2, 3, 9, 11>
Due 10 June 2018
HashIntSetClass
 */
package moroneychrishw08;
// Implements a set of integers using a hash table.
// The hash table uses separate chaining to resolve collisions.
public class HashIntSet {
    private static final double MAX_LOAD_FACTOR = 0.75;
    private HashEntry[] elementData;
    private int size;
    
    // Constructs an empty set.
    public HashIntSet() {
        elementData = new HashEntry[10];
        size = 0;
    }
    
    // Adds the given element to this set, if it was not already
    // contained in the set.
    public void add(int value) {
        if (!contains(value)) {
            if (loadFactor() >= MAX_LOAD_FACTOR) {
                rehash();
            }
            
            // insert new value at front of list
            int bucket = hashFunction(value);
            elementData[bucket] = new HashEntry(value, elementData[bucket]);
            size++;
        }
    }
    
    // Removes all elements from the set.
    public void clear() {
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
    
    // Returns true if the given value is found in this set.
    public boolean contains(int value) {
        int bucket = hashFunction(value);
        HashEntry current = elementData[bucket];
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Removes the given value if it is contained in the set.
    // If the set does not contain the value, has no effect.
    public void remove(int value) {
        int bucket = hashFunction(value);
        if (elementData[bucket] != null) {
            // check front of list
            if (elementData[bucket].data == value) {
                elementData[bucket] = elementData[bucket].next;
                size--;
            } else {
                // check rest of list
                HashEntry current = elementData[bucket];
                while (current.next != null && current.next.data != value) {
                    current = current.next;
                }
                
                // if the element is found, remove it
                if (current.next != null && current.next.data == value) {
					current.next = current.next.next;
					size--;
				}
            }
        }
    }
    
    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }
    
    // Returns a string representation of this queue, such as "[10, 20, 30]";
    // The elements are not guaranteed to be listed in sorted order.
    public String toString() {
        String result = "[";
        boolean first = true;
        if (!isEmpty()) {
            for (int i = 0; i < elementData.length; i++) {
                HashEntry current = elementData[i];
                while (current != null) {
                    if (!first) {
                        result += ", ";
                    }
                    result += current.data;
                    first = false;
                    current = current.next;
                }
            }
        }
        return result + "]";
    }
    
    
    // Returns the preferred hash bucket index for the given value.
    private int hashFunction(int value) {
        return Math.abs(value) % elementData.length;
    }
    
    private double loadFactor() {
        return (double) size / elementData.length;
    }
    
    // Resizes the hash table to twice its former size.
    private void rehash() {
        // replace element data array with a larger empty version
        HashEntry[] oldElementData = elementData;
        elementData = new HashEntry[2 * oldElementData.length];
        size = 0;

        // re-add all of the old data into the new array
        for (int i = 0; i < oldElementData.length; i++) {
            HashEntry current = oldElementData[i];
            while (current != null) {
                add(current.data);
                current = current.next;
            }
        }
    }
    
    // Represents a single value in a chain stored in one hash bucket.
    private class HashEntry {
        public int data;
        public HashEntry next;

        public HashEntry(int data) {
            this(data, null);
        }

        public HashEntry(int data, HashEntry next) {
            this.data = data;
            this.next = next;
        }
    }
    
//HW08Ex01 -- write a method that adds all of the elements from one other HashSet to another if the values 
//            are not equivalent
    public void addAll(HashIntSet otherSet) {
        // iteratate threw the entire other Set, which will find its length
        for (int k = 0; k < otherSet.elementData.length; k++){
            // the hashEntry will determine the number of keys needed based on the 
            // length of the elementData. The relationship of these two determines not
            // only how many keys, but how long the list is even if the number of 
            // values do not fill all of the entries
            HashEntry thisEntry = otherSet.elementData[k];
            // if the hashEntry is not null (meaning there is a value in it)...
            if(thisEntry != null){
                // then initialize the value inside the hashentry
                int thisVal = thisEntry.data;
                // add it to the original HashSet
                add(thisVal);
                // while its next value is not null...
                while(thisEntry.next!=null){
                    // add that next value...keep going until there is no more values to add
                    thisEntry = thisEntry.next;
                    int n = thisEntry.data;
                    add(n);
                }               
            }
        } 
    }   
//Hw08Ex02 -- write a method that determines whether or not a smaller HashSet can be found entirely inside of 
//            the other HashSet.
    public boolean containsAll(HashIntSet otherSet){
        // initialize a boolean that determines the return value
        boolean bReturn = true;
        // iterate through the entire set, determining the number of keys
        // we need to recieve.
        for(int k = 0; k < otherSet.elementData.length; k++){
            // the we are looking at is determined by k
            HashEntry thisEntry = otherSet.elementData[k];
            // if that key is NOT empty...
            if(thisEntry!=null){
                // then set its value inside equal to the data inside
                int thisVal = thisEntry.data;
                // if the original HashSet contains this value...
                if(this.contains(thisVal)){
                    // continually check the next value, while it is not null...
                    while(thisEntry.next!=null){
                        // initialize the hashEntry to get the next value
                        thisEntry = thisEntry.next;
                        // initialize the data for that value inside
                        int n = thisEntry.data;
                        // if the original does not contain the value, then we
                        // need to return false regardless because the sets are not
                        // containing of the values
                        if(!(this.contains(n))){
                            bReturn = false;
                            break;
                        }
                    }
                // same reasoning as above with returning false. If we get to here 
                // (which is when we do not contain the value provided at first)
                } else {
                    //break the loop and set the whole thing to false
                    bReturn = false;
                    break;
                }
            }
            
        }
        // return whatever we get from above
        return bReturn;
    }
//HW08Ex03 -- write a method that determines whether or not an inputed HashSet is completely 
//            equal to the other
    public boolean equals(HashIntSet otherSet){
        // initialize a boolean which will be used for the return value
        boolean bReturn = true;
        // Iterate through the entire set, determining the number of keys in the ORIGINAL set
        for(int i = 0; i < elementData.length; i++){
            // HashSet's length is determined by number of keys, which is the length in
            // iteration
            HashEntry thisEntry = elementData[i];
            //if the key is not null
            if(thisEntry!=null){
                // initialize the data values
                int thisVal = thisEntry.data;
                // determine whether or not the otherSet contains this value. If it doesn't...
                if(!otherSet.contains(thisVal)){
                    // then break the whole thing and return false;
                    bReturn = false;
                    break;
                }
                // if the first data value is cleared and found, then compare all of the other ones inside
                while(thisEntry.next!=null){
                    // intialize the next values and compare them
                    thisEntry = thisEntry.next;
                    int n = thisEntry.data;
                    // if we can't find that value in the otherSet...
                    if(!otherSet.contains(n)){
                        // break the loop and return false
                        bReturn = false;
                        break;
                    }
                } 
                    
            }
        }
        // IF, AND ONLY IF, we still remain true from above, we have to compare the other set
        // back to the original. This is because everything from one set could be found in the other
        // but not the other way around, just as seen from Exercise 2. We need to compare the two sets
        // in the same way, just backwards. If the boolean is false, we will bypass this entire section
        if(bReturn){
            
            // This code is completely identical from above, except that otherSet replaces 
            // the orignal, and original replaces otherSet. THis is the "backwards" comparing. 
            // Because it is the exact same piece of code, just the other way, I will not comment this area.
            
            for(int i = 0; i < otherSet.elementData.length; i++){
                HashEntry thisEntry = otherSet.elementData[i];
                if(thisEntry!=null){
                    int thisVal = thisEntry.data;
                    if(!this.contains(thisVal)){
                        bReturn = false;
                        break;
                    }
                    while(thisEntry.next!=null){
                        thisEntry = thisEntry.next;
                        int n = thisEntry.data;
                        if(!this.contains(n)){
                            bReturn = false;
                            break;
                        }
                    }         
                }
            }
        }
        // At the VERY end, we will return whether or not everything is identical (which is true), or
        // if we do not have a complete match.
        return bReturn;
    }
}
