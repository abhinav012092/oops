package lec_10;
import java.util.*;
import java.io.*;
import java.lang.*;

public class kadenes_algo_max_subarray_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max_sum=Integer.MIN_VALUE;
		int curr_sum=0;
		
		for(int i=0;i<arr.length;i++) {
			curr_sum += arr[i];
			
			if(curr_sum>max_sum) {
				max_sum=curr_sum;
			}
			
			if(curr_sum<0) {
				curr_sum=0;
			}
		}
		System.out.println(max_sum);
	}
}
