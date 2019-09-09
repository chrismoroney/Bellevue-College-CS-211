/*
Chris Moroney
CS 211 Livingston Section B (1:30)
Page 822 Exercise <2, 4, 6, 8, 15>
Due 6 May 2018
*/
package moroneychrishw04;

public class MoroneyChrisHW04 {

// tester   
    public static void main(String[] args) {
        System.out.println("Chris Moroney");
        System.out.println("CS 211 Livingston Section B (1:30)");
        System.out.println("Homework 04");
        System.out.println("Page 822 Exercise <2, 4, 6, 8, 15>");
        System.out.println("Due 6 May 2018");
        System.out.println();
        
        System.out.println();
        System.out.println();
        
        System.out.println("Excercise 2");
        System.out.println();
        System.out.println("In this exercise, we need to print out all the integers from one to a desired number");
        System.out.println();
        System.out.println("Suppose the desired number is 5. The printed sequence would look like this: "); 
        writeNums(5);
        System.out.println();
        System.out.println();
        System.out.println("Again, with the desired number now as 12, the sequence would look like this:");
        writeNums(12);
        System.out.println();
        System.out.println();
        
        System.out.println();
        System.out.println("Excercise 4");
        System.out.println();
        System.out.println("In this exercise, we need to print a number that produces two of each number per digit. ");
        System.out.println();
        System.out.println("For instance, if we insert the number 789, then the number we get back would be: ");
        System.out.println(doubleDigits(789));
        System.out.println();
        System.out.println("If we insert a negative number, then our output needs to be negative as well. ");
        System.out.println("We can just change the inputed number to -789 for demonstration, which will give us: ");
        System.out.println(doubleDigits(-789));
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 6");
        System.out.println();
        System.out.println("In this exericse, we need to write all of the squares up to a given number");
        System.out.println("All odd numbered squares are in descending order first");
        System.out.println("After the last odd square, the even squares will print in ascending order");
        System.out.println();
        System.out.println("If the desired number is 8, the squares will print out as the following");
        writeSquares(8);
        System.out.println();
        System.out.println();
        System.out.println("As we can see, the sqaures descend at first with the odd squares, and then ascend with the even squares after one.");
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 8");
        System.out.println();
        System.out.println("In this exercise, we need to multply the first number of even integers, determined by a desired number.");
        System.out.println();
        System.out.println("Suppose the desired is 4, the method will multiply the first 4 even numbers together, which is 2 * 4 * 6 * 8.");
        System.out.println();
        System.out.println("The product of these numbers is: ");
        System.out.println(multiplyEvens(4));
        System.out.println();
        System.out.println();
        
        System.out.println("Exercise 15");
        System.out.println();
        System.out.println("In this exercise, we need to demonstrate the product of the math equation: (n)! / (n-r)!");
        System.out.println();
        System.out.println("What this means is that each the product of the dividing factorials (all integers less than or equal to number multiplying by itself)");
        System.out.println("will provide the number of unique permutations. ");
        System.out.println();
        System.out.println("Suppose our n value is 7, and our r value 4.");
        System.out.println();
        System.out.println("Mathematically, we are calculating (7 * 6 * 5 * 4 * 3 * 2 * 1) / (4 * 3 * 2 * 1) which is equal to (7 * 6 * 5)");
        System.out.println();
        System.out.println("The result of this equation is:");
        System.out.println(permut(7, 2));
        System.out.println();
        System.out.println("Another example is the values of n = 6 amd r = 3");
        System.out.println();
        System.out.println("The result of this equation would be");
        System.out.println(permut(6, 3));

    }
// HW04EX02 -- write a method that prints all of the integers in a sequence until int e
    public static void writeNums(int e){
        // if e is less than one
        if (e < 1){
            // throws a new IllegalArgumentException, basically won't run
            throw new IllegalArgumentException();
        }
        // if e is one, which would be the only number in the sequence til e
        else if (e == 1){
            // just print it
            System.out.print(e);
        // else...
        } else {
            // continue this method until we get to one, where it will print just the number...
            writeNums(e - 1);
            // and then place in all the other numbers
            System.out.print(", " + e);
        }
    }
// HW04EX04 -- write a method that doubles the quanitity of digits and is placed by two of a digit
//             if int n is negative, MUST produce a negative number with it as well
    public static int doubleDigits(int n){
        // initialize ints'
        int digit;
        int shift;
        // if n is zero, then there is essentially no digit we have to return
        if (n == 0) {
            return 0;
        } else {
            // be aware, it isn't the most efficient coding with the integers implied, but
            // i am using them for the sakes of explanation as this example is quite complicated
            
            // digit: this int will continually take the last digit of the number until n is 0
            // it does this by taking the remainder when dividing by ten. For instance, with the
            // number 78, dividing 10 will produce remainder 8, and 8 divided by 10 produces
            // remainder of 0, which will stop the recursion
            digit = n % 10;
            
            // shift: this int is effectively "the recursion". The process from left to right
            // goes as followed. The doubleDigits() method will continue to produce recursively
            // until it the n value is zero. At this point, shift begins by creating two "placeholder"
            // digits towards the right of the numberline by multiplying by 100 at the beginning. 
            // The parts that go into the "placeholder" are the results of putting in n / 10
            // because we want to eliminate the factors from the end of original int n.
            // Shift then continues by adding 10 * digit, then + 10 to begin filling in the the rest of the values 
            // required for continuing the number. This is essentially the numnbers that go into the placeholders. 
            // By this time, once n == 0, the recursion will stop, and eventually won't add any more because shift
            // would just be adding zero. 
            shift = 100 * doubleDigits(n / 10) + 10 * digit + digit;
            return shift;
        }
    }
// HW04EX06 -- write a method that prints all positive square numbers up to int n
//             all odd squares have to begin from the left in descending order
//             all even squares begin after the last odd square (which is one), in ascending order
    public static void writeSquares(int n) {
        // if n is less than one...
        if(n < 1){
            // throw new Illegal Argument Exception, basically can't run
            throw new IllegalArgumentException();
        // if n is one...
        } else if(n == 1) {
            // just print n because it is the only square
            System.out.print(n);
        // if n is an odd square...
        } else if (n % 2 != 0) {
            // print the square value, and then a comma: these squares appear first
            System.out.print(n * n + ", ");
            // THEN do recursion 
            writeSquares(n - 1);
        // if n is an even square...
        } else if(n % 2 == 0) {
            // do recursion FIRST
            writeSquares(n - 1);
            // THEN print out the comma and square after, this will force the odd squares printed first
            System.out.print(", " + n * n);
        }
    }
// HW04EX08 -- write a method that returns the product of the first n even integers
    public static int multiplyEvens(int n){
        // if n is zero or less...
        if (n <= 0){
            // throw new Illegal Argument Exception, can't run
            throw new IllegalArgumentException();
        // if n is one...
        } else if (n == 1){
            // return 2, this is the only even integer 
            return 2;
        } else {
            // process goes as followed: We take 2 * n because this will give us ONLY
            // even integers. We multiply it by its recursive product so that we can 
            // continue getting all even integers until we get n == 1 (which would be two)
            // then we just multiply them all together
            return (2 * n) * multiplyEvens(n-1);
        }
    }
// HW04EX15 -- write a recursive method that demonstrates (n)! / (n-r)! to give number of unique permutations
//             helpful note: the above equation with provided numbers demonstrates as such with numbers 5 and 2
//             (5*4*3*2*1) / (2*1) = (5*4*3)
    public static int permut(int n, int r){
        // r effectively is the placeholder to continue or break recursion, once it is
        // zero, then recursion stops
        if (r == 0) {
            return 1;
        } else {
            // while r is not zero, we will take n and keep multiplying by its recursive result
            // which is just one less than n. The r "placeholder" is just one less as well until
            // it reaches zero
            return n * (permut(n-1, r-1));
        }
    } 
}
