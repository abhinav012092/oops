/*
Consider an array for which on day i, ith element is the price of a given stock.
we are permitted at most only one transaction(i.e buy one and sell one share of stock).Find the maximum profit.

Note:Buying a stock is mandatory before selling.
Input Format
First line contains integer n as size of array. Next n lines contains n integer as element of array.

Constraints
None

Output Format
Print the maximum profit.
Sample Input
6
7
1
5 
3 
6 
4

Sample Output
5
*/
package assignment_2_arrays;
import java.util.*;
import java.lang.*;

public class Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]++);
		}
		int min_sp=arr[0],max_profit=0;
		for(int i=0;i<arr.length;i++) {
			min_sp=Math.min(min_sp, arr[i]);
			int profit=arr[i]-min_sp;
			max_profit=Math.max(max_profit, profit);
		}
		System.out.println(max_profit);
	}
}