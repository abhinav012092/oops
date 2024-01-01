/*
Sort just 0 and 1
Input Format
A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
Constraints
N will not exceed 10^7

Output Format
Sorted Sequence
Sample Input
7
1 0 0 1 1 0 1

Sample Output
0 0 0 1 1 1 1
 */
package assignment_2_arrays;
import java.util.*;

public class sort_just_zeroes_and_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt0=0,cnt1=1;
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				cnt0++;
			} else if(arr[i]==1) {
				cnt1++;
			}
		}
		int i=0;
		for(i=0;i<=cnt0;i++) {
			arr[i]=0;
		}
		for(i=i-1;i<arr.length;i++) {
			arr[i]=1;
		}
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}

}
