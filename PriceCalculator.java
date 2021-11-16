/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;
import java.util.Scanner;
/**
 *
 * @author nadio
 */
public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //We use the scanners here to get user input later
        Scanner myItemPrice = new Scanner(System.in);
        Scanner myDiscountRatio = new Scanner(System.in);

        //Getting the user's input
        System.out.print("Please enter the item price:");
        double ItemPrice = myItemPrice.nextDouble();
        System.out.print("Please enter the discount ratio (5 for 5%):");
        double DiscountRatio = myDiscountRatio.nextDouble();
        
        //Now we calculate price before tax
        double PriceBeforeTax = ItemPrice - (ItemPrice * DiscountRatio / 100);
        //Now we calculate federal tax
        double FederalTax = PriceBeforeTax * 5 / 100;
        //Now we calculate provincial tax
        double ProvincialTax = PriceBeforeTax * 9.975 / 100;
        //Now we calculate final price
        double FinalPrice = PriceBeforeTax + FederalTax + ProvincialTax;
        
        //Now we print the results
        System.out.printf("\nOriginal Price \t\t:%.2f\n",ItemPrice );
        System.out.printf("Discount Ratio \t\t:%.2f%%\n ",DiscountRatio);
        System.out.printf("Price Before Tax \t:%.2f\n", PriceBeforeTax);
        System.out.println("-------------------------------");
        System.out.printf("Federal Tax \t\t:%.2f\n", FederalTax);
        System.out.printf("Provincial Tax \t\t:%.2f\n", ProvincialTax);
        System.out.printf("Final Price \t\t:%.2f\n", FinalPrice);
        
        
        // TODO code application logic here
    }
    
}
