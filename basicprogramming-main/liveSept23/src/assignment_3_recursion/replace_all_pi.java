/*
Replace all occurrences of pi with 3.14
Input Format
Integer N, no of lines with one string per line
Constraints
0 < N < 1000
0 <= len(str) < 1000

Output Format
Output result one per line
Sample Input
3
xpix
xabpixx3.15x
xpipippixx

Sample Output
x3.14x
xab3.14xx3.15x
x3.143.14p3.14xx
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int x=0;x<N;x++) {
			String str = sc.next();
			System.out.println(replaceallpi(str));
		}
	}
	
	public static String replaceallpi(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)=='p' && str.charAt(1)=='i' && str.length()>=2) {
			return "3.14"+ replaceallpi(str.substring(2,str.length()));
		}
		return str.charAt(0)+replaceallpi(str.substring(1,str.length()));
	}

}
