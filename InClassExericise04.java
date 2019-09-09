/*
Chris Moroney
CS 211 Mr. Livingston Section B (1:30)
In Class Exercise #4 -- Exercise <2> from page 1013
Due 18 May 2018
Test Client
 */
package inclassexericise04;

public class InClassExericise04 {

    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();

        list.add(3);
        list.add(15);
        list.add(67);
        list.add(35);
        list.add(85);
        list.add(2);
        list.add(86);
        list.add(770);
        list.add(463);
        list.add(10);
        list.add(39);
        list.add(54);
        list.add(74);
        list.add(26);
        list.add(84);
        
        // should return 2
        System.out.println(list.min());
    }
    
}
