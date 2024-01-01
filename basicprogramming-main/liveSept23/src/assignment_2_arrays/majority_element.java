/*
Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
You may assume that the array is non-empty and the majority element always exist in the array.
Input Format
First line contains integer N (size of the array) followed by N more integers.
Constraints
Output Format
Majority Element of array
Sample Input
3
1 1 2

Sample Output
1

Explanation
Number of 1's in the array is more than 3/2 , Hence majority element is 1
*/
package assignment_2_arrays;
import java.util.*;
public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0,res=0;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]==arr[i-1]) {
				count++;
				if(count>=(arr.length-1)/2) {
					res=arr[i];
				}
			}
		}
		System.out.println(res);
	}

}
