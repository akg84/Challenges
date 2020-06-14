/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specifictarget;

/**
 *
 * @author nisha
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class SpecificTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = {2,7,11,15};
        int target = 9;
        for (int i = 0; i < num.length; i++)
        {
            for (int j = i+1; j< num.length; j++){
                if (num[j] == target - num[i]) 
                { 
                    System.out.println("Indices of TargetSolution " + "[" + i + "," + j + "]");
                }
            }
        }
        
    }
    
}
