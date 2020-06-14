/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofcoins;

import java.util.Scanner;

/**
 *
 * @author nisha
 * Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent), write code to calculate the number of ways of representing n cents
 */
public class NumberOfCoins {
    
    public static void totalCoins(int amount) {
        
        int[] demon = new int[] {25,10,5,1};
        int[] counter = new int[4];
        int total = 0;
        
        for (int i=0;i<4;i++)
        {
            if (amount >= demon[i])
            {
                counter[i] = amount/demon[i];
                amount = amount - counter[i] * demon[i];
            }
        }
        for (int i = 0;i<4;i++)
        {
            if (counter[i] != 0)
            {
                total += counter[i];
            }
        }
        
        System.out.println("Minimum number of coins " + total);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        totalCoins(amount);
    }
    
}
