/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author nisha
 * 
 * program to generate fibonacci series for n numbers
 */
public class FibonacciSeries {

    
    static void printFibnaciiSeries(int n){
        int f1 = 0, f2 = 1, i;
        for (i = 0; i<=n; i++){
            System.out.println(f2 + " ");
            int next = f1+f2;
            f1 = f2;
            f2 = next;
        }
    }
    
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scan = new Scanner(System.in);
        
        printFibnaciiSeries(Scan.nextInt());
        System.out.println(fib(Scan.nextInt()));
    }
    
}
