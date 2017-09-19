package ie.gmit.java3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final double EURO_TO_DOLLAR; //= 1.45
        final double DOLLAR_TO_EURO;
        double euros, dollars, rate;
        
        System.out.print("Enter current Euro Dollar rate: ");            //System.out.print("Enter current Euro Dollar rate: " + rate);
        EURO_TO_DOLLAR = console.nextDouble();
        
        System.out.println("Enter Euro amount");
        euros = console.nextDouble();
        System.out.println();
        
        dollars =  euros * EURO_TO_DOLLAR;
        System.out.println(euros + " Euro equals " + dollars + " Dollars");
        System.out.println();
    
        System.out.printf("%.2f Euros equals %.2f Dollars.%n", euros, dollars);
        System.out.println();
        
        DOLLAR_TO_EURO = 1 / EURO_TO_DOLLAR;
        System.out.printf("Dolar Euro rate is %.3f ", DOLLAR_TO_EURO);
        System.out.println();
        
        System.out.println("Enter Dollar amount");
        dollars = console.nextDouble();
        System.out.println();
        
        euros = dollars * DOLLAR_TO_EURO;
        System.out.println(dollars + " Dollars equals " + euros + " Euro.");
        
        System.out.printf("%.2f Dollars equals %.2f Euro.%n",dollars, euros);
        System.out.println();
        
        
        
        
        
        
    }
}
