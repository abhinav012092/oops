package Lec_04;
import java.util.*;

public class replace_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long digit,ans=0,mult=1;
		while(n>0) {
			digit=n%10;
			if(digit==0) {
				digit=5;
			}
			ans+=(digit*mult);
			mult*=10;
			n/=10;
		}
		if(ans==0) {
			ans=5;
		}
		System.out.println(ans);
	}

}
