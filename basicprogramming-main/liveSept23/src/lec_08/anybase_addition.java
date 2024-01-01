package lec_08;
import java.util.*;

public class anybase_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int d = getSum(b, n1, n2);
		System.out.println(d);
	}
	
	public static int getSum(int b, int n1, int n2) {
		int rv = 0,c=0,p=1;//c=carry,rv=return value
		
		while(n1>0 || n2>0 || c>0) {
			int d1 = n1%10;
			int d2 = n2%10;
			n1/=10;
			n2/=10;
			
			int d = d1+d2+c;
			c=d/b;
			d=d%b;
			
			rv+=d*p;
			p*=10;
		}
		return rv;
	}

}
