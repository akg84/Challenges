/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a,b = "";
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        int n = a.length();
        for (int i = n-1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b))
        {
            System.out.println("This is a palindrome");
        }
        else 
        {
            System.out.println("This is a not palindrome");
        }   
    }
    
}
