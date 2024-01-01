/*
Help Lakshya bhaiya spy on Ali. Tell him how many times did you see him!!
Note : Who is ali?! An element.
Input Format
Take an input N, the size of array. Take N more inputs and store that in an array.

Take another integer input ali in the next line.
Constraints
-1000,000,000<Ali<1000,000,000 size of array < 1000,000

Output Format
The count of number of ali's in the array !!
Sample Input
6
10 20 10 20 12 20
10

Sample Output
2 

Explanation
Ali is 20.
Ali comes 2 times in the aray
*/
package assignment_2_arrays;
import java.util.*;

public class how_many_times_did_you_see_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int ele = sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}
		}
		System.out.println(count);
	}

}
