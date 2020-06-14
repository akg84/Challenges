/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestsumcontiguoussubarray;

import java.util.Scanner;

/**
 *
 * @author nisha
 * 
 * You are given an array of integers (both positive and negative). Find the continuous sequence with the largest sum. Return the sum.
 *  eg- Input {2, -8, 3, -2, 4, -10}
 *  Output : 5 (i.e. {3, -2, 4})
 */
public class LargestSumContiguousSubarray {

    static int LSCS(int [] arr)
    {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i<arr.length ; i++){
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    
    static void LSCSwithIndices (int [] a)
    {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        
        for (int i = 0; i < a.length ; i++)
        {
            max_ending_here += a[i];
            
            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
            System.out.println("Maximum contiguous sum is " + max_so_far); 
            System.out.println("Starting index " + start); 
            System.out.println("Ending index " + end); 
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Largest Sum of continious Array" + LSCS(a));
        LSCSwithIndices(a);
    }
    
}
