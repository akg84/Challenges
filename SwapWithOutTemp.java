/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapwithouttemp;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class SwapWithOutTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Value of x " + x + " Value of y " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Value of x " + x + " Value of y " + y);
    }
    
}
