package lec_08;
import java.util.*;

public class count_digit_in_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int r,count=0;
		while(n>0) {
			r=n%10;
			if(r==digit) count++;
			n/=10;
		}
		System.out.println(digit+" frequency is "+count);
	}

}
