/*
Take N as input. Print all prime numbers from 2 to N.
Input Format
Constraints
1 <= N <= 1000
Output Format

Sample Input
10

Sample Output
2
3
5
7

Explanation
Each output should be on separate line. A prime number is that number which is divisible by one or itself.
 */
package assignment1;
import java.util.*;

public class print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i=2,divisor=1,count=0;
		while(i<=N) {
			while(divisor<=i) {
				if(i%divisor==0)
					count++;
				divisor++;
			}
			if(count<=2)
				System.out.println(i);
			divisor=1;
			count=0;
			i++;
		}
	}

}
