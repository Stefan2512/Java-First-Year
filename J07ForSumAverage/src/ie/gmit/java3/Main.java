package ie.gmit.java3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        final int MAX_NUMBERS = 3;
        double value, sum= 0, average;
        
        for(int i=1; i<=MAX_NUMBERS; i++){
            System.out.print("Enter value " + i + ": ");
            value = console.nextDouble();
            sum = sum + value;
        }
        System.out.println("\nSum is: " + sum);
        average = sum/MAX_NUMBERS;
        System.out.printf("\nThe average is : %.2f ", average);

        
        
        
    }
}
