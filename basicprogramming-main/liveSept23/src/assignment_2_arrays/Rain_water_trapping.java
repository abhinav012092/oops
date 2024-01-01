package assignment_2_arrays;
import java.util.*;

public class Rain_water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int k=0;k<T;k++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int left[] = new int[N];
			int right[] = new int[N];
			left[0]=arr[0];
			for(int i=1;i<arr.length;i++) {
				left[i]=Math.max(left[i-1], arr[i]);
			}
			right[N-1]=arr[N-1];
			for(int i=N-2;i>=0;i--) {
				right[i]=Math.max(right[i+1], arr[i]);
			}
			int ans=0;
			for(int i=0;i<N;i++) {
				ans+=(Math.min(left[i], right[i])-arr[i]);
			}
			System.out.println(ans);
		}
	}

}
