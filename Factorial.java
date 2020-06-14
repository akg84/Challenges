/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nisha
 * 
 * Write a program to print all the combinations of factors of given number n.

Examples - 
Input : 16
Output :2 2 2 2 
        2 2 4 
        2 8 
        4 4 

Input : 12
Output : 2 2 3
         2 6
         3 4
 * 
 */
public class Factorial {

	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            System.out.println(new Factorial().getFactors(i));

	}

	public List<List<Integer>> getFactors(int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		helper(result, temp, n, 2);
		return result;
	}

	public void helper(List<List<Integer>> result, List<Integer> temp, int n, int start) {
		//When n<=1, we reach the end of one recursion, so we add temp to main result.
		if (n <= 1) {
			if (temp.size() > 1) {
				result.add(new ArrayList<Integer>(temp));
			}
		}

		for (int i = start; i <= n; i++) {
			//When n%i is 0, pass n/i as 'n'
			if (n % i == 0) {
				temp.add(i);
				helper(result, temp, n / i, i);
				//This step is important to remove the older entry and generate a new combination of factors.
				temp.remove(temp.size() - 1);
			}
		}
	}

}
