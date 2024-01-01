/*
Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.
a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.
b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
Note: Use cin for input for C++
Input Format
Enter a string
Constraints
None
Output Format
Print all the subsequences in a space separated manner and isplay the total no. of subsequences.
Sample Input
abcd

Sample Output
 d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
16

Explanation
Print all possible subsequences of the given string.
 */
package assignment_3_recursion;
import java.util.*;

public class subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solve(str,"");
        int p = str.length();
        System.out.println();
        System.out.print((int)(Math.pow(2, p)));
	}
	
	public static void solve(String frens, String party) {
		if(frens.isEmpty()) {
			System.out.print(party+" ");
			return;
		}
		
		char ch = frens.charAt(0);
		String sp = frens.substring(1);//bcd
		solve(sp, party);//include
		solve(sp, party+ch);//exclude
		
	}
}
