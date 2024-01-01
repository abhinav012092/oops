package recursion_1;
import java.util.*;

public class Nth_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum=nthtri(N);
		System.out.println(sum);
	}
	public static int nthtri(int N) {
		if(N==1) {
			return 1;
		}
		int sum=N;
		sum+=nthtri(N-1);
		return sum;
	}
}
