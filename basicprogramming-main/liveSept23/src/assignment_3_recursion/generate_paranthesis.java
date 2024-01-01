/*
Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.
Input Format
Single line containing an integral value 'n'.
Constraints
1<=n<=11
Output Format
Print the balanced parentheses strings with every possible solution on new line.
Sample Input
2

Sample Output
()())
(()) 
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class generate_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Number:");
	    int n = sc.nextInt();
	    List<String> list = new ArrayList<String>();
	    char arr[] = new char[2 * n];
	    generateparanthesis(arr, 0, 0, 0, n, list);
	    for (String pair: list) {
	      System.out.println(pair);
	    }
	}
	    
	public static void generateparanthesis(char arr[], int pos, int open, int close, int N, List < String > list) {
	    if (pos == (2 * N)) {
	        String s = "";
	        for (int i = 0; i < 2 * N; i++) {
	          s += String.valueOf(arr[i]);
	        }
	        list.add(s);
	        return;
	      }

	      if (open > close) {
	        arr[pos] = ')';
	        generateparanthesis(arr, pos + 1, open, close + 1, N, list);
	      }
	      if (open < N) {
	        arr[pos] = '(';
	        generateparanthesis(arr, pos + 1, open + 1, close, N, list);
	      }
	}
}
