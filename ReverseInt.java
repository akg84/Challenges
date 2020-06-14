/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseint;

import java.util.Scanner;

// @author nisha
// 
//         Given a 32-bit signed integer, reverse digits of an integer.
//
//Examples:
//Input: 123
//Output: 321
//
//Input: -123
//Output: -321

public class ReverseInt {
    
    static int Reverse(int x){
        long rev = 0;
        while (x != 0)
        {
            rev = rev * 10 + x%10;
            x /= 10;
        }
        
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) 
        {
            return 0;
        }
        else 
        {
            return (int)rev;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(Reverse(x));
    } 
}
