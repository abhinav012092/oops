/*
Take as input N, a number. Print the following pattern. Can you do it recursively ?!
Hint : Bigger Problem? Smaller Problem ? wrt pattern
(for N =4)

*

* *

* * *

* * * *

* * * * *
Input Format
Enter the value of N
Constraints
None
Output Format
Tab separated (*)
Sample Input
5

Sample Output
*
*	*
*	*	*
*	*	*	*
*	*	*	*	*
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class recursion_pattern_1_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		patterntri(1,N);
	}
	public static void patterntri(int i, int N) {
		if(i>N) {
			return;
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*  ");
		}
		System.out.println();
		patterntri(++i, N);
	}

}
