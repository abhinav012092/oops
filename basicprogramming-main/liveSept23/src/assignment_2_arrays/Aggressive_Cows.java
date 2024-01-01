/*
Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).
His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
Input Format
First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

Constraints
2 <= N <= 100,000
0 <= xi <= 1,000,000,000
2 <= C <= N

Output Format
Print one integer: the largest minimum distance.

Sample Input
5 3
1 2 8 4 9

Sample Output
3

Explanation
Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]
 */
package assignment_2_arrays;
import java.util.*;

public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int C = sc.nextInt();
		for(int x=0;x<N;x++) {
			arr[x]=sc.nextInt();
		}
		Arrays.sort(arr);
		int low=1,high=arr[arr.length-1]-arr[0];
		while(low<=high) {
			int mid = (low+high)/2;
			if(canWePlace(arr, mid, C)==true) {
				low=mid+1;
			} else {
				high = mid-1;
			}
		}
		System.out.println(high);
	}
	
	public static boolean canWePlace(int[] arr, int dist, int cows) {
		int n=arr.length;
		int cntcows=1;
		int last=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]-last>=dist) {
				cntcows++;
				last=arr[i];
			}
			if(cntcows >= cows) return true;
		}
		return false;
	}

}
