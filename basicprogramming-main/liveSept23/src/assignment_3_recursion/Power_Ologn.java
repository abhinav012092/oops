/*
Take as input x and n, two numbers. Write a function to calculate x raise to power n. Target complexity is O(logn).
NOTE: Try both recursive and bitmasking approach.
Input Format
Enter the number N and its power P
Constraints
None
Output Format
Display N^P
Sample Input
2
3
Sample Output
8
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class Power_Ologn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Your Code Here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int np = power(N,P);//N^P
        System.out.println(np);
	}
	
	public static int power(int N, int P) {
		if(P==0) {
			return 1;
		}
		int nrpb2=power(N,P/2);
		int np=nrpb2*nrpb2;
		
		if(P%2==1) {
			np=np*N;
		}
		return np;
	}
}
