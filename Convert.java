/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Write a function to capitalize the first letter of each word in a string.
//Examples:
//Input : string = "day is bright and nice"
//Ouput: "Day Is Bright And Nice"

package convert;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class Convert {
    
    static String stingManupulation(String str){
        
        char ch[] = str.toCharArray();
        for (int i = 0; i< str.length(); i++)
        {
            // Checking 1st char
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ' )
            {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                {
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
  
                // Convert into Lower-Case 
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
  
        // Convert the char array to equivalent String 
        String st = new String(ch); 
        return st; 
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(stingManupulation(str));
    }
    
}
