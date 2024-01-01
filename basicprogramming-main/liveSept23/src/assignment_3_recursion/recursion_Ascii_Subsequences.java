/*
Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.
b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).
Input Format
Enter the string

Constraints
None

Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences
Sample Input
ab

Sample Output

 b 98 a ab a98 97 97b 9798
9
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class recursion_Ascii_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> al =new ArrayList<String>();
        al=solve(str,"",al);
        for(int i=0;i<al.size();i++) {
        	System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println(al.size());
	}
	
	public static ArrayList<String> solve(String frens, String party, ArrayList<String> al) {
		if(frens.isEmpty()) {
			al.add(party);
			//System.out.print(party+" ");
			//System.out.println(cnt);
			return al;
		}
		
		char ch = frens.charAt(0);
		int bh = (int)(ch);
		String ah = String.valueOf(bh);
		String sp = frens.substring(1);//bcd
		solve(sp, party, al);//include
		solve(sp, party+ch,al);//exclude
		solve(sp, party+ah, al);
		return al;
	}
}
