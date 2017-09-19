package ie.gmit.java3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner console = new Scanner(System.in);
        int startNumber, endNumber, sum=0, average, counter=0;
        
        System.out.print("Enter the start number: ");
        startNumber = console.nextInt();
        System.out.print("Enter the end number: ");
        endNumber = console.nextInt();
        
        
        for (int i = startNumber; i<= endNumber;++i){
            counter = counter + 1;
            sum = sum + i;
          
            
            
            
        }//end of for loop
        average = sum/counter;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}
