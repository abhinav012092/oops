package lec_10;
import java.util.*;
import java.lang.*;
import java.io.*;

public class string_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*String s1 = sc.next();
		String s2 = sc.nextLine();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s2);
		*/
		//char ch = s1.charAt(0);
		//System.out.println(ch);
		
		//for(int i=0;i<s1.length();i++) {
			//ch=s1.charAt(i);
			//System.out.print(ch);
		//}
		
		
		/*String s3 = "abcd";
		//System.out.println(s3.substring(1, 3));//bc
		//System.out.println(s3.substring(0, 1));//a
		for(int i=0;i<s2.length();i++) {
			for(int j=i+1;j<=s3.length();j++) {
				System.out.println(s3.substring(i, j));
			}
			System.out.println();
		}
		*/
		//String s1 = "hello";
		/*
		 * String s2 = "world"; String s3 = s1+" "+s2;
		 */
		/*
		 * s1 +=' '; s1 +='w'; s1 +='o'; s1 +=7; System.out.println(s1);
		 */
		System.out.println("hello"+10+20);
		String s= "abc,def,ghi,jkl mno";
		String[] parts= s.split(",");
		for(int i=0;i<parts.length;i++) {
			System.out.println(parts[i]);
		}
		String s1="hello";
		String s2="hello";
		String s3 = new String("hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4="";
		for(int i=0;i<=10;i++) {
			s4+=i;
		}
		System.out.println(s4);
	}
}
