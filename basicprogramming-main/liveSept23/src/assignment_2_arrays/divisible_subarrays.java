package assignment_2_arrays;
import java.util.*;

public class divisible_subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
        while(t-->0){
           int n = sc.nextInt(); 
           int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=sc.nextInt();
            System.out.println(subarraysDivByK(arr, n)); 
        }
    }
	
	public static long subarraysDivByK(int[] num, int k) {
		int[] count =new int[k];
		int sum=0;
		for(int x: num) {
			sum+=(x%k +k)%k;
			count[sum%k]++;
		}
		long res = count[0];
		for(int c:count) {
			res+=(c*(c-1))/2;
		}
		return res;
	}

}
