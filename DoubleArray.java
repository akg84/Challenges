/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublearray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class DoubleArray {

    static ArrayList<Number> SizeDouble(int[] num, int size) {
        ArrayList<Number> al = new ArrayList<Number>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < num.length; j++) {
                al.add(num[j]);
            }
        }

        return al;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = {1, 2, 3, 4, 5};
        
        Scanner scan = new Scanner(System.in);
        int sizeofArray = scan.nextInt();
        System.out.println(SizeDouble(num, sizeofArray));
    }

}
