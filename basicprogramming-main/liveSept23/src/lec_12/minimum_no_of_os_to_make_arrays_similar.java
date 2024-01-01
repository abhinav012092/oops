package lec_12;
import java.util.*;
public class minimum_no_of_os_to_make_arrays_similar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		int[] arr2 = new int[N];
		int sum1=0,sum2=0;
		for(int i=0;i<N;i++) {
			arr1[i]=sc.nextInt();
			sum1+=arr1[i];
		}
		Arrays.sort(arr1);
		for(int i=0;i<N;i++) {
			arr2[i]=sc.nextInt();
			sum2+=arr2[i];
		}
		Arrays.sort(arr2);
		if(sum1==sum2) {
			
		}
	}

}
