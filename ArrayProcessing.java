import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class ArrayProcessing {
 
    public static void main(String[] args) {
        int[] arrayData = {69, 3, 12, 21, 1, 144, 2, 5, 299, 4};
 
        int sum = 0;
        for (int number : arrayData) {
            sum += number;
        }
        double average = (double) sum / arrayData.length;
 
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : arrayData) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
 
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : arrayData) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
 
        int evenSum = 0;
        for (int number : evenNumbers) {
            evenSum += number;
        }
        double evenAverage = (double) evenSum / evenNumbers.size();
 
        int oddSum = 0;
        for (int number : oddNumbers) {
            oddSum += number;
        }
        double oddAverage = (double) oddSum / oddNumbers.size();
 
        System.out.println(Arrays.toString(arrayData));
        System.out.println("Average of all numbers: " + average);
        System.out.println("Array (Even Numbers): " + Arrays.toString(evenNumbers.toArray()));
        System.out.println("Average of even numbers: " + evenAverage);
        System.out.println("\nArrayList (Odd Numbers): " + oddNumbers);
        System.out.println("Average of odd numbers: " + oddAverage);
    }
}