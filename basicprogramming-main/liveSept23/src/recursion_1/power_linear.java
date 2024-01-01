package recursion_1;
import java.util.*;

public class power_linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(calcpow(n,p));
	}

	public static int calcpow(int n, int p) {
		if(p==0) {
			return 1;
		}
		return n*calcpow(n,p-1);
	}
}
