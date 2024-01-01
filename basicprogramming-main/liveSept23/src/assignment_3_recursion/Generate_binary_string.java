package assignment_3_recursion;
import java.util.*;
import java.io.*;
public class Generate_binary_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			String str = sc.next();
			Generate_binary_string(str,"");
			T--;
		}
	}
	
	public static void Generate_binary_string(String str, String path) {
		if(str.length()<1) {
			System.out.println(path);
			return;
		}
		//for(int i=0;i<str.length();i++) {
		char ch = str.charAt(0);
			//System.out.println(ch);
		if(ch!='?') {
			Generate_binary_string(str.substring(1), path+ch);
		} else {
			Generate_binary_string(str.substring(1), path+"0");
			Generate_binary_string(str.substring(1), path+"1");
		}
		//}
	}

}
