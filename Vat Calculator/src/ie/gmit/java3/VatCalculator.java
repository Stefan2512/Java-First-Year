//Simple Vat operation
//Stefan Radu
package ie.gmit.java3;
import java.util.Scanner;
public class VatCalculator {
    public static void main(String[] args) {
        //declare your variables and input your code
        Scanner console = new Scanner(System.in);
        double vatValue;
        double removeVat;
        double addVat;
        int choice;
        System.out.println("Please enter Vat Value: ");
        vatValue = console.nextDouble();
        System.out.println("Please select\n 1 to add VAT or 2 to remove VAT");
        
        choice = console.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("You have selected option 1");
                System.out.print("Please enter the amount of Euro: ");
                addVat = console.nextDouble();
                System.out.println(" You have entered " + addVat + " Euro.");
                addVat = (addVat + addVat * 0.23);
                System.out.println("The value plus vat is: " + addVat);
                
                break;
            case 2:
                System.out.println("You have selected option 2");
                System.out.print("Please enter the amount of Euro: ");
                addVat = console.nextDouble();
                System.out.println(" You have entered " + addVat + " Euro.");
                addVat = (addVat - addVat * 0.23);
                System.out.println("The value with vat deducted is: " + addVat);
                break;
            default:
                System.out.println("Must make a proper choice. 1 or 2");
                break;
        }
        
        
        
    }//end of main
    
}//vat calculator