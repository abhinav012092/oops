/*
Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion
Input Format
Constraints
1 <= N <=1000
Output Format
Sample Input
5
Sample Output
5
3
1
2
4
*/
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class odd_even_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		deco(N);
		ince(N,2);
	}
	public static void deco(int N) {
		if(N<=0) {
			return;
		}
		if(N%2==0) {
			N=N-1;
		}
		System.out.println(N);
		deco(N-2);
	}
	public static void ince(int N, int i) {
		if(i>N) {
			return;
		}
		System.out.println(i);
		ince(N,i+2);
	}
}
