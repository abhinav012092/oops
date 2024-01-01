/*
Take digits one by one and make a single number by concatenating them.

Digits are given from 1's place.
Input Format

First line contains total digits = num. Following lines contains digits starting from 1's place
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
41358
 */
package assignment1;
import java.util.*;
public class make_number_from_digits_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		long digit,cnt=0,num=0,mult=1;
		while(i>0) {
			digit=sc.nextLong();
			num=(digit*mult)+num;
			cnt++;
			mult*=10;
			i--;
		}
		System.out.println(num);
	}

}
