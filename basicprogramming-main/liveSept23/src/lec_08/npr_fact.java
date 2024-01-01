package lec_08;
import java.util.*;

public class npr_fact {

	public static int fact(int n) {
		int prod=1,i;
		for(i=1;i<=n;i++){
				prod*=i;
		}
	return prod;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		//int n=5,r=2;
		//int nfact,nmrfact;
		
		int npr = (int)(fact(n)/fact(n-r));
		System.out.println(npr);
	}
	
	
}
