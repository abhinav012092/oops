package oops1;
import java.util.*;
import java.io.*;

public class recursion_twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		recursivetwins(str,0);
	}
	
	public static void recursivetwins(String str, int count) {
		if(str.length()==2) {
			System.out.println(count);
			return;
		}
		char ch1=str.charAt(0);
		char ch2=str.charAt(2);
		String ros=str.substring(1);
		if(ch1==ch2) count++;
		recursivetwins(ros, count);
	}

}
