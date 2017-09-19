package ie.gmit.java3;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // write your code here
        Scanner console = new Scanner(System.in);
        final Double INCH_TO_CM = 2.54;
        double inches, cm, foot, yards;
        
        System.out.println("Please enter Yards: ");
        yards = console.nextDouble();
        
        System.out.println("Please enter Feet: ");
        foot = console.nextDouble();
        
        System.out.println("Please enter Inches: ");
        inches = console.nextDouble();
        
        //calculations
        
        cm =(inches + (12 * foot) + (36 * yards)) * INCH_TO_CM;
        
        //print the results to screen
        System.out.println(yards + " Yards " + foot + " Feet " + inches + " Inches");
        System.out.println(" equals " + cm + " Centimetres");
    }//method main
    
    
    
    
}//class main
