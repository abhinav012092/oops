/*
Help Lakshya Bhaiya recite tables of an input number x to the limit y.

Print all the multiples of x till y.

Note : y is inclusive
Input Format

Take two inputs, x and y
Constraints

1<=x<=10,000 1<=y<=10,000
Output Format
each line contains the table of the number x
Sample Input
13 50

Sample Output
13
26
39
 */
package assignment1;
import java.util.*;
public class do_you_know_table_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i=1;
		while(x*i<=y) {
			System.out.println(x*i);
			i++;
		}
	}

}
