package lec_08;
import java.util.*;

public class decimal_to_anybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int dn = getValueInBase(n,b);
		System.out.println(dn);
		/*int mult=1,ans=0,r;
		while(n>0) {
			r=n%b;
			ans+=(r*mult);
			mult*=10;
			n/=b;
		}
		System.out.println(ans);
		*/
	}
	
	public static int getValueInBase(int n, int b) {
		int ans=0,p=1,r;
		while(n>0) {
			r=n%b;
			ans+=(r*p);
			p*=10;
			n/=b;
		}
		return ans;
	}
}
