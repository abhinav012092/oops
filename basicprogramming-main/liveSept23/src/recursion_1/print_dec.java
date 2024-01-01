package recursion_1;
import java.util.*;

public class print_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pd(n);
	}
	
	public static void pd(int n) {
		if(n==1) {
			System.out.println("1");
			return;
		}
		System.out.println(n);
		pd(n-1);
	}

}
