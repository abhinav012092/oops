package lec_10;
import java.util.*;
import java.io.*;

public class print_all_palindromic_Substring {

	public static void solution(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String ss = str.substring(i,j);
				if(isPalindrome(ss)==true) {
					System.out.println(ss);
				}
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int i=0,j=str.length()-1;
		while(i<=j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			
			if(ch1!=ch2) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
		
	}

}
