/*
Take digits one by one and make a single number by concatenating them.

Digits are given from Left Most place.
Input Format

First line contains total digits = num. Following lines contains digits starting from the Left Most place.
Constraints

1<=num<=12

0<=digits<=9
Output Format

print the number in a single line
Sample Input
5
8
5
3
1
4

Sample Output
85314
 */
package assignment1;
import java.util.*;
import java.math.*;

public class make_number_from_digits_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		
		long x=10l,digit,num2=0l;
		//int mult=(int) Math.pow(x, num-1);
		while(num>0) {
			digit=sc.nextLong();
			num2=(num2*10)+digit;
			//mult *= 10;
			num--;
		}
		System.out.println(num2);
	}

}
