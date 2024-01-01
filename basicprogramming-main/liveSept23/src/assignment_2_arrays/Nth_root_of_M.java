package assignment_2_arrays;
import java.util.*;

public class Nth_root_of_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int answer = root(M,N);
			System.out.println(answer);
		}
	}
	
	public static int root(int M, int N) {
		int s=1;
		int e=M;
		int ans=-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(Math.pow(mid, N)==M) {
				ans=mid;
				return ans;
			} else if(Math.pow(mid, N)<M) {
				s=mid+1;
			} else {
				e=mid-1;
			}
		}
		return ans;
	}

}
