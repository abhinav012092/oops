package lec_08;
import java.util.*;

public class input_char_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int res = (int)ch;
		//System.out.println((char)19856);
		if(res>='A' && res<='Z') {
			System.out.println("Upper");
		} else if (res>='a' && res<='z') {
			System.out.println("lower");
		} else {
			System.out.println("?");
		}
	}

}
