/*
Help Lakshya bhaiya count!!!
Input Format
First line contains an Integer n.
Constraints
n<10,000
Output Format

Print the counting from 1 to n.
Sample Input
5

Sample Output
1
2
3
4
5
 */
package assignment1;
import java.util.*;

public class count_to_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

}
