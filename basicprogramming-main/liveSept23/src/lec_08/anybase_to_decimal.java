package lec_08;
import java.util.*;

public class anybase_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int d = getValueIndecimal(n,b);
		System.out.println(d);
	}
	
	public static int getValueIndecimal(int n, int b) {
		int ans=0,r,mult=1;
		while(n>0) {
			r=n%10;
			ans+=(r*mult);
			mult*=b;
			n/=10;
		}
		return ans;
	}

}
