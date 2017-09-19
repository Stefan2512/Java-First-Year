package ie.gmit.java3;
import java.util.Scanner;
public class j08SquareCube {
    public static void main(String[] args) {
    //declare your variables and input your code
        Scanner console = new Scanner(System.in);
        
    int numberSquared, numberCubed=1;
  
    System.out.println(" No Square    Cube");
    System.out.println("=====================");
    for( int i = 1; i < 9; i++){
        numberSquared = i * i;
        numberCubed = i * i * i;
        System.out.printf("%3d   %5d   %7d \n", i, numberSquared, numberCubed);
        
    }//end of for loop
    
    }//end of main
}
