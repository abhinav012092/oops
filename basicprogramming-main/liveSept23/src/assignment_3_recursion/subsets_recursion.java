/*
Find all the subsets of a given array that sum to k.
Input Format
The first line contains an integer N , the size of the array. The next line conatins N integers. The next line contains an integer K.
Constraints
0 < N <= 20
Output Format
Output all the subsets that sum to K. The output should be printed as follows :
    Sets with least no of elements should be printed first.
    For equal length, elements that appear later in the original set,should be printed first.

Sample Input
5
1 4 6 5 3
10

Sample Output
6 4
3 6 1
5 4 1

Explanation
4 + 6 = 10
1 + 4 + 5 = 10
1 + 3 + 6 = 10
 */
package assignment_3_recursion;
import java.util.*;

public class subsets_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr =new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		printTargetSumSubsets(arr, 0, "",0,k);
	}
	
	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
		if(idx==arr.length) {
			if(sos==tar) {
				System.out.println(set);
			}
			return;
		}
		printTargetSumSubsets(arr, idx+1,set,sos,tar);
		printTargetSumSubsets(arr, idx+1,arr[idx]+" "+set,arr[idx]+sos,tar);
		
	}
	
}
