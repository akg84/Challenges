/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatedchar;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class RepeatedChar {
    
    static char FirstRepeatChar (char str[])
    {
        HashSet<Character> hash = new HashSet<>();
        
        for (int i = 0; i<= str.length - 1; i++)
        {
            char c = str[i];
            if (hash.contains(c))
            {
                return c;
            }
            else{ 
                hash.add(c);
            }
        }
        return '\0';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char [] arr = str.toCharArray();
        System.out.println(FirstRepeatChar(arr));
    }
    
}
