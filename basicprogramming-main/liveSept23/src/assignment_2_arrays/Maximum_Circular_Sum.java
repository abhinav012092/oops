/*
Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].

Input Format
First line contains integer t which is number of test case.
For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

Constraints
1<=t<=100
1<=n<=1000
|Ai| <= 10000

Output Format
Print the maximum circular sum for each testcase in a new line.

Sample Input
1
7
8 -8 9 -9 10 -11 12

Sample Output
22

Explanation
Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)
 */
package assignment_2_arrays;
import java.util.*;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int max_str_sum=Integer.MIN_VALUE;
			int min_str_sum=Integer.MAX_VALUE;
			int arr_sum=0;
			int temp_maxsum=0,temp_minsum=0;
			//int sum=0,max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				//sum=arr[i];
				arr_sum+=arr[i];
				
				temp_maxsum+=arr[i];
				if(max_str_sum<temp_maxsum) {
					max_str_sum=temp_maxsum;
				}
				if(temp_maxsum<0) {
					temp_maxsum=0;
				}
				
				temp_minsum+=arr[i];
				if(min_str_sum>temp_minsum) {
					min_str_sum=temp_minsum;
				}
				if(temp_minsum>0) {
					temp_minsum=0;
				}
				
				/*if(arr_sum==min_str_sum) {
					System.out.println(max_str_sum);
				} else {
					System.out.println(Math.max(max_str_sum, (arr_sum-min_str_sum)));
				}*/
				/*for(int j=i+1;j<arr.length && j!=i;j++) {
					sum+=arr[j];
					if(sum>max) {
						max=sum;
					}
				}
			}
			//System.out.println(sum);*/
		}
		if(arr_sum==min_str_sum) {
			System.out.println(max_str_sum);
		} else {
			System.out.println(Math.max(max_str_sum, (arr_sum-min_str_sum)));
		}
	}

	}
}
