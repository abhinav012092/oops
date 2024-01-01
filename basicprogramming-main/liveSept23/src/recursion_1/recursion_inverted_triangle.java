package recursion_1;
import java.util.*;

public class recursion_inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		invtri(N);
	}
	public static void invtri(int N) {
		if(N==0) {
			return;
		}
		for(int i=1;i<=N;i++) {
			System.out.print("*  ");
		}
		System.out.println();
		invtri(N-1);
	}

}
