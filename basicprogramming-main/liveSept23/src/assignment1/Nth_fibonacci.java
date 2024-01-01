/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
Input Format
Constraints
0 <= N <= 1000
Output Format

Sample Input
10

Sample Output
55

Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.
*/
package assignment1;
import java.util.*;

public class Nth_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=1,first_num=0,second_num=1,sum=0;
		while(cnt<=n) {
			sum=first_num+second_num;
			first_num=second_num;
			second_num=sum;
			cnt++;
		}
		System.out.println(first_num);
	}

}
