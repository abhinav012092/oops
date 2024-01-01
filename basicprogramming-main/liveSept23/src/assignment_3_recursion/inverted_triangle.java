/*
Take as input N, a number. Print the following pattern (for N = 5)

       *    *   *   *   *   
       *    *   *   *
       *    *   *
       *    *   
       *    
Input Format
Enter value of N
Constraints
None
Output Format
Tab separated (*)
Sample Input
5

Sample Output
*	*	*	*	*	
*	*	*	*	
*	*	*	
*	*	
*	
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		invtri(N);
	}
	public static void invtri(int N) {
		if(N==0) {
			return;
		}
		for(int i=0;i<N;i++) {
			System.out.print("*  ");
		}
		System.out.println();
		invtri(N-1);
	}

}
