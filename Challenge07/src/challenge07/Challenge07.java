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

    public static String formatPrice(Integer price) {
        return "$" + Integer.toString(price / 100) + "." + Integer.toString(price % 100)
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        final double STATE_TAX = 0.04;    //State tax rate
        final double COUNTY_TAX = 0.02;   //County tax rate
        Integer purchaseStateTax;        //State tax on purchase
        Integer purchaseCountyTax;       //County tax on purchase
        Integer totalTax;                //Total tax on purchase
        Integer purchasePrice;           //User-entered purchase price
        Integer totalPrice;              //The total price to be displayed
        
        System.out.print("How much is the snow mobile? $");  
        //To find purchase price
        double rawPurchasePrice = keyboard.nextDouble(); //User input

        purchasePrice = Math.round(rawPurchasePrice * 100);


            
            purchaseStateTax = Math.round(purchasePrice * STATE_TAX);    
                        //Computes state tax on purchase
                        
        purchaseCountyTax = Math.round(purchasePrice * COUNTY_TAX);
                        //Computes county tax on purchase
        
        totalTax = purchaseStateTax + purchaseCountyTax;
                        //Computes total sales tax
                        
        totalPrice = purchasePrice + totalTax;
        
        
                        //Computes total price
        
        System.out.println("Price: " + formatPrice(purchasePrice));
        
        System.out.println("4% State Sales Tax: " + formatPrice(purchaseStateTax));
        
        System.out.println("2% County Sales Tax: " + formatPrice(purchaseCountyTax));
        
        System.out.println("Total Sales Tax: " + formatPrice(totalTax));
                
        System.out.println("Total Cost: " + formatPrice(totalPrice));
                         //Displays information computed by program
        
        
        
        
        
        
    }
    
}
