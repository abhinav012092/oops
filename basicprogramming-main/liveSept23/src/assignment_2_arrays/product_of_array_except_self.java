/*
Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].
Challenge : do this without division in linear time
Input Format
First line contains integer N as size of array.
Next line contains a N integer as element of array. The product of any prefix or suffix of arr is guaranteed to fit in a 32-bit integer.
Constraints
-10000000 < arr[i]<=10000000
Output Format
Print output array
Sample Input
4
1 2 3 4

Sample Output
24 12 8 6 
*/
package assignment_2_arrays;
import java.util.*;

public class product_of_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		//int prod=1,quo=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			//prod*=arr[i];
		}
		int prod=1;
		int[] right = new int[N];
		//prod=1;
		for(int i=right.length-1;i>=0;i--) {
			prod*=arr[i];
			right[i]=prod;
		}
		prod=1;
		int[] res = new int[N];
		for(int i=0;i<res.length-1;i++) {
			int lp = prod;
			int rp=right[i+1];
			res[i]=lp*rp;
			prod*=arr[i];
		}
		res[arr.length-1]=prod;
		for(int ele : res) {
			System.out.print(ele+" ");
		}
	}

}
