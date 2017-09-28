package ie.gmit.java3;
import java.io.*;
import java.util.Scanner;
public class MenuClass {
    MenuClass() {
    
    }
    
    public void displayMenuOptions() {
        System.out.println("Option 1");
        System.out.println("Option 2");
        
        
    }//end of displayMenuOptions{
    
    
    //menu Method
    public void getUserInput() {
        Scanner s = new Scanner(System.in);
        int userInput;
        System.out.println("Welcome! Choose from the options below: ");
        this.displayMenuOptions();
        while ((userInput = Integer.parseInt(s.next())) != 3) {
            switch (userInput) {
                case 1: {
                    System.out.println("Option one works");
                    break;
                }//end case 1
                case 2: {
                    System.out.println("Option Two works");
                    break;
                }//end of case 2
                
                default:{
                    System.out.println("The only options are 1 and 2. Select again: \n");
                    this.displayMenuOptions();
                }//default option
                
            }//end of switch
        }
    }
}