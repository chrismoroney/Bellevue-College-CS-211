
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ArrayListInt {
    public static void main(String[] args) throws FileNotFoundException {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner input = new Scanner(new File("Numbers.txt"));
    while (input.hasNextInt()) {
        int n = input.nextInt();
        numbers.add(n);
    }   
    System.out.println("Average: " + findAverage(numbers));
    findHighestAndLowest(numbers);
    System.out.println(numbers);
    filterEvens(numbers);
    System.out.println(numbers);
}       
    public static double findAverage(ArrayList<Integer> list){
        double n = 0;
        double average = 0;
        for (int i = list.size() - 1; i >= 0; i--){
            n += list.get(i);
        }
        average =  n / list.size();
        return average;
    }
    public static void findHighestAndLowest(ArrayList<Integer> list){
        int lowest = 10000000;
        int highest = -1000000;
        for (int i = 1; i < list.size(); i++){
            int first = list.get(i);
            if (first > highest){
                highest = first;
            } else if (first < lowest){
                lowest = first;
            }
        }
        System.out.println("Lowest number: " + lowest);
        System.out.println("Highest number: " + highest);
    }
    public static void filterEvens(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int n = list.get(i);
            if (n % 2 == 0) {
                list.remove(i);
            }
        }   
    }
}
