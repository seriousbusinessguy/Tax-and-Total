/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge07;
import java.util.Scanner;

/**
 *
 * @author lewis
 */
public class Challenge07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final double STATE_TAX = .04;    //State tax rate
        final double COUNTY_TAX = .02;   //County tax rate
        double purchaseStateTax;        //State tax on purchase
        double purchaseCountyTax;       //County tax on purchase
        double totalTax;                //Total tax on purchase
        double purchasePrice;           //User-entered purchase price
        double totalPrice;              //The total price to be displayed
        
        System.out.print("How much is the snow mobile? $");  
                        //To find purchase price
            purchasePrice = keyboard.nextDouble();           //User input
            
            purchaseStateTax = purchasePrice * STATE_TAX;    
                        //Computes state tax on purchase
                        
        purchaseCountyTax = purchasePrice * COUNTY_TAX;
                        //Computes county tax on purchase
        
        totalTax = purchaseStateTax + purchaseCountyTax;
                        //Computes total sales tax
                        
        totalPrice = (double)Math.round((purchasePrice + totalTax)*100)/100;
        
        
                        //Computes total price
        
        System.out.println("Price: $" + purchasePrice);
        
        System.out.println("4% State Sales Tax: $" + 
                (double)Math.round(purchaseStateTax*100)/100);
        
        System.out.println("2% County Sales Tax: $" + 
                (double)Math.round(purchaseCountyTax *100)/100);
        
        System.out.println("Total Sales Tax: $" + 
                (double)Math.round(totalTax*100)/100);
                
        System.out.println("Total Cost: $" + totalPrice);
                         //Displays information computed by program
        
        
        
        
        
        
    }
    
}
