package lec_10;
import java.util.*;
public class string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		
		char ch=sb.charAt(0);
		System.out.println(ch);
		
		sb.setCharAt(0, 'y');
		System.out.println(sb);
		
		sb.append('w');
		System.out.println(sb);
		sb.insert(2, 'a');
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder();
		for(int i=0;i<100;i++) {
			sb1.append(i+" ");
		}
		System.out.println(sb1);
	}

}
