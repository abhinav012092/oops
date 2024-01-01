package recursion_1;
import java.util.*;

public class print_inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pi(n);
	}
	
	public static void pi(int n) {
		if(n==1) {
			System.out.println("1");
			return;
		}
		pi(n-1);
		 System.out.println(n);
	}

}
