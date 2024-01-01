/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.
Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.
b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).
Input Format
Single line input containing a single integer.
Constraints
1 <= Length of string <= 10^3
Output Format
Print all the words in a space separated manner. Also print the count of these numbers in next line.
Sample Input
12

Sample Output
ad ae af bd be bf cd ce cf
9

Explanation
1 can correspond to 'a' , 'b' or 'c' .
2 can correspond to 'd', 'e' or 'f'.
We print all combinations of these
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class keypad_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> words = new ArrayList<String>();
		words = getKeyPadCodes(str);
		for(int i=0;i<words.size();i++) {
			System.out.print(words.get(i)+" ");
		}
		System.out.println();
		System.out.println(words.size());
	}
	static String[] codes = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static ArrayList<String> getKeyPadCodes(String str){
		if(str.length()==0) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rres = getKeyPadCodes(ros);
		ArrayList<String> mres = new ArrayList<String>();
		
		String codeforch = codes[ch-'0'];
		for(int i=0;i<codeforch.length();i++) {
			char chcode = codeforch.charAt(i);
			for(String rstr: rres) {
				mres.add(chcode+rstr);
			}
		}
		return mres;
	}
}
