/*
Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.
Input Format
Enter a number in form of a String
Constraints
1 <= Length of String <= 10

Output Format
Print the number after converting it into integer

Sample Input
1234

Sample Output
1234

Explanation
Convert the string to int. Do not use any inbuilt functions.
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;
public class convert_int_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		converttoint(str);
	}
	public static void converttoint(String str) {
		int num=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int ah = (int)(ch-'0');
			num+=ah;
			if(i!=str.length()-1) {
				num*=10;
			}
		}
		System.out.println(num);
	}

}
