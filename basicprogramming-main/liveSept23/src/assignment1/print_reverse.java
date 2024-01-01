/*
Take N as input, Calculate it's reverse also Print the reverse.
Input Format
Constraints
0 <= N <= 1000000000

Output Format
Sample Input
123456789

Sample Output
987654321

Explanation
You've to calculate the reverse in a number, not just print the reverse.
 */
package assignment1;
import java.util.*;

public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int rev=0;
		while(N>0) {
			rev=rev*10+N%10;
			N/=10;
		}
		System.out.println(rev);
	}

}
