/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordoccurence;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class WordOccurence {
    
    public static int countOccurence(String str, String word)
    {
        int counter = 0;
        String [] a = str.split(" ");
        //for (String a1 : a) {
            //if (word.equals(a1)) {
            for (int i = 0; i <a.length; i++){ 
               if (word.equals(a[i]))
               {
                   counter++;
               }
          //  }
        }
         return counter;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.nextLine();
        System.out.println(countOccurence(str, word));
        
    }
    
}
