/*
Given a integer as a input and replace all the '0' with '5' in the integer
Input Format
Enter an integer n
Constraints
0<=n<=1000000000000

Output Format
All zeroes are replaced with 5
Sample Input
102

Sample Output
152

Explanation
Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.
 */
package assignment1;
import java.util.*;
import java.math.*;
public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long P = sc.nextLong();
		long i=0l,Q=P,mult=1l,digit;
		
		while(Q>0) {
			if(Q%10==0)
				P=P+5*mult;
			Q/=10;
			mult*=10;
		}
		System.out.println(P);
	}

}
