/*
Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.
Input Format
Integer N is the single line of input.
Constraints
1 <= N <= 100
Output Format
Print the output as a single integer which is the nth triangle.
Sample Input
3

Sample Output
6
 */
package assignment_3_recursion;
import java.util.*;

public class Nth_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = nthtri(N);
		System.out.println(sum);
	}
	public static int nthtri(int N) {
		if(N==1) {
			return 1;
		}
		int sum=N;
		sum+=nthtri(N-1);
		return sum;
	}

}
