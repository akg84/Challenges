/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternmatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nisha
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *  An input string is valid if:
 *   1. Open brackets must be closed by the same type of brackets.
 *   2. Open brackets must be closed in the correct order.
 *
 *   Note that an empty string is also considered valid.
 *
 *   Examples:
 *   Valid Strings: "()", "{()[]}", "()[]{}", "{[{}()]()}"
 *   Invalid Strings: "([)", "([]", "((]]"
 * 
 */
public class PatternMatch {

    public static boolean isValid(String s) {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);
 
		if (map.containsKey(curr)) {
			stack.push(curr);
		} else if (map.containsValue(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
			}
		}
	}
 
	return stack.empty();
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(isValid(str));
    }
}
