package lec_03;
import java.util.*;
import java.math.*;
public class makenum_fromdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		long digit,cnt=0,num=0,mult=1;
		while(i>0) {
			digit = sc.nextLong();
			num = (digit*mult)+num;
			cnt++;
			mult*=10;
			i--;
		}
		System.out.println(num);
	}

}
