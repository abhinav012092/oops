/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

Input Format
The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
Constraints
Length of the arrays should be between 1 and 1000.

Output Format
Print all the pairs of numbers which sum to target. Print each pair in increasing order.

Sample Input
5
1
3
4
2
5
5

Sample Output
1 and 4
2 and 3

Explanation
Find any pair of elements in the array which has sum equal to target element and print them.
*/
package assignment_2_arrays;
import java.util.*;

public class arrays_target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		
		int l=0,r=arr.length-1;
		while(l<r) {
			int sum=arr[l]+arr[r];
			if(sum==target) {
				System.out.println(arr[l]+ " and "+arr[r]);
				if(l<r) {
					l++;r--;
				}
			}else if(sum<target) {
				l++;
			} else {
				r--;
			}
		}
	}

}
