package recursion_1;
import java.util.*;

public class fbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(7));
	}
	public static int fibo(int n) {
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		int sp1=fibo(n-1);
		int sp2=fibo(n-2);
		return sp1+sp2;
	}
}
