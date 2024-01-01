/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
Input Format
Constraints
0 < N <= 1000000000
Output Format

Sample Input
101010

Sample Output
42

Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
 */
package assignment1;
import java.util.*;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int dec=0,mult=1,digit;
		while(bin>0) {
			digit=bin%10;
			dec+=(digit*mult);
			mult*=2;
			bin/=10;
		}
		System.out.println(dec);
	}

}
