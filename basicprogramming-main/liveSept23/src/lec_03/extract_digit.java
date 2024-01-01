package lec_03;
import java.util.*;
public class extract_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit,c=0;
		while(n>0) {
			digit=n%10;
			n/=10;
			c=c*10+digit;
		}
		System.out.println("the reverse of a number n is "+c);
	}

}
