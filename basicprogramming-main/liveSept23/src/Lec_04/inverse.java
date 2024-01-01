package Lec_04;
import java.util.*;
public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit,pos=1,inv=0,mult=1;
		while(num>0) {
			digit=num%10;
			mult=(int) Math.pow(10, digit-1);
			inv+= (pos*mult);
			pos++;
			num/=10;
		}
		System.out.println(inv);
	}

}
