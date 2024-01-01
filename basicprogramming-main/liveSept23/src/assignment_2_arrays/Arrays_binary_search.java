/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input a number M. Write a function which returns the index on which M is found in the array, in case M is not found -1 is returned. Print the value returned.You can assume that the array is sorted, but you’ve to optimize the finding process. For an array of size 1024, you can make 10 comparisons at maximum.
1.It reads a number N.
2.Take Another N numbers as input in Ascending Order and store them in an Array.
3.Take Another number M as input and find that number in Array.
4.If the number M is found, index of M is returned else -1 is returned.Print the number returned.
Input Format

Constraints
N cannot be Negative. Range of Numbers N and M can be between -1000000000 to 1000000000
Output Format

Sample Input
5
3
5
6
9
78
6

Sample Output
2
*/
package assignment_2_arrays;
import java.util.*;

public class Arrays_binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int M = sc.nextInt();
		int idx = binarysearch(arr, M);
		System.out.println(idx);
	}
	
	public static int binarysearch(int[] arr, int M) {
		int l=0,r=arr.length-1,mid=0;
		while(l<=r) {
			mid=(l+r)/2;
			if(arr[mid]==M) {
				return mid;
			}
			if(arr[mid]<M) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
	}

}
