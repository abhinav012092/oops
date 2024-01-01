/*
 * 
Help Lakshya Bhaiya recite tables of an input number x to the limit x*y.

Print the table of x from x*1, x * 2, x * 3… x * y.
Input Format

Take two inputs, x and y
Constraints

x<=10,000 y<=10,000
Output Format
each line contains the table of the number x
Sample Input
2 4

Sample Output
2
4
6
8
 */
package assignment1;
import java.util.*;

public class do_you_know_table_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i=1;
		while(i<=y) {
			System.out.println(x*i);
			i++;
		}
	}

}
