package recursion_1;
import java.util.*;

public class odd_even_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		deco(N);
		//ince(N);
	}
	public static void deco(int N) {
		if(N-1<0) {
			return;
		}
		if(N%2==0) {
			N=N-1;
		}
		System.out.println(N);
		deco(N-2);
		if(N-1!=0) {
			System.out.println(N-1);
		}
	}
	public static void ince(int N) {
		int i=2;
		if(i>N) {
			return;
		}
		
		if(i<N) {
			System.out.println(i);
			ince(i);
		}
		i=i+2;
		//System.out.println(i);
	}
	

}
