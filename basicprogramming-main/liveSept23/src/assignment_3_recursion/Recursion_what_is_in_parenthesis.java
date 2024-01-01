/*
Take as input str, a string. The string contains a single pair of parenthesis “(..)”. Write a recursive function which returns the contents between the parenthesis. E.g. for “xyz(abc)def” return “abc”. Print the value returned.
Input Format
Enter the string
Constraints
None

Output Format
Display the content between the parenthesis
Sample Input
abc(x)

Sample Output
x
*/
package assignment_3_recursion;
import java.util.*;

public class Recursion_what_is_in_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x=0,y=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(') {
				x = i+1;
				break;
			}
		}
		for(int j=str.length()-1;j>=0;j--) {
			char bh =str.charAt(j);
			if(bh==')') {
				y=j;
				break;
			}
		}
		System.out.println(str.substring(x,y));
	}

}
