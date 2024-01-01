package lec_10;
import java.util.*;

public class String_Compression {

	public static String compression1(String str) {
		char c = str.charAt(0);
		String s = String.valueOf(c);
		
		for(int i=1;i<str.length();i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr != prev) {
				s+=curr;
			} 
		}
		return s;
	}
	
	public static String compression2(String str) {
		int count=1;
		char c = str.charAt(0);
		String s = String.valueOf(c);
		
		for(int i=1;i<str.length();i++) {
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			if(curr==prev) {
				count++;
			} else {
				if(count>1) {
					s+=count;
					count=1;
				}
				s+=curr;
			}
		}
		if(count>1) {
			s+=count;
			count=1;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
