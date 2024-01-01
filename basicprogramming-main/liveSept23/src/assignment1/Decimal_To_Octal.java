/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.
Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77

Explanation
Both input and output are integers
 */
package assignment1;
import java.util.*;

public class Decimal_To_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int divisor=8,R,Dividend=N,oct=0,mult=1;
		while(N>0) {
			R=Dividend%8;
			oct+=(R*mult);
			mult*=10;
			N/=8;
			Dividend=N;
		}
		System.out.println(oct);
	}

}
