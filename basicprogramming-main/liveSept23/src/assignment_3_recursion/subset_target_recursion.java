/*
Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
a. Write a recursive function which prints subsets of the array which sum to target.
b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
Input Format
Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
Constraints
None
Output Format
Display the number of subsets and print the subsets in a space separated manner.
Sample Input
3
1
2
3
3

Sample Output
1 2  3
2

Explanation
Add 2 spaces between 2 subset solutions
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class subset_target_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int x=0;x<N;x++) {
			arr[x]=sc.nextInt();
		}
		int target = sc.nextInt();
		int cnt=0;
		cnt=printTargetSumSubset(arr,0,"",0,target,cnt);
		System.out.println();
		System.out.println(cnt);
	}
	
	public static int printTargetSumSubset(int[] arr, int idx, String set, int sos, int tar, int cnt) {
		if(idx==arr.length) {
			if(sos==tar) {
				cnt++;
				System.out.print(set+"  ");
			}
			return cnt;
		}
		
		cnt=printTargetSumSubset(arr, idx+1, set+arr[idx]+" ", sos+arr[idx],tar,cnt);
		cnt=printTargetSumSubset(arr, idx+1, set+" ", sos,tar,cnt);
		return cnt;
	}
}
