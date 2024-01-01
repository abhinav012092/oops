package recursion_1;
import java.util.*;

public class print_triangle_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		printtri(1,N);
	}
	public static void printtri(int i, int N) {
		if(i>N) {
			return;
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*   ");
		}
		System.out.println();
		printtri(++i,N);
	}

}
