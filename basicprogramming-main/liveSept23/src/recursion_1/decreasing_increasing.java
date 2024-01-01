package recursion_1;
import java.util.*;
public class decreasing_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printdecinc(n);
		//printincreasing(n);
	}
	
	public static void printdecinc(int n) {
		if(n==0) return;
		System.out.println(n);
		printdecinc(n-1);
		System.out.println(n);
	}
	/*
	 * public static void printincreasing(int n) { if(n==0) { return; }
	 * printincreasing(n-1); System.out.println(n); }
	 */
}
