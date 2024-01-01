/*
After eating to his stomach's limit, Lakshya bhaiya realized that he forgot to eat dessert. Help Lakshya bhaiya select the lightest dessert !!
Take an input N, the number of dessert choices. Take N more inputs. Where n1,n2,n3….nN represents the weight of each each dessert. For eg- ni => is the wieght of dessert menu number i.
Write a function which returns the dessert menu number of the lightest dessert.
Print the value returned.
Note : Remember the dessert menu number starts from 1
Input Format
First line contains integer n as size of the menu. Next n lines contains the weight of each dessert in the menu.
Constraints
N cannot be Negative. Range of Weight can be between 0 to 100000
Output Format
Print the required output.

Sample Input
4
99 81 23 25

Sample Output
3

Explanation
Menu is like this :
Order number => Weight
1 => 99
2 => 81
3 =>23
4=> 25

Hence lightest dessert is 23 with order number 3.
 */
package assignment_2_arrays;
import java.util.*;

public class ice_cream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int res = des_menu_num(arr);
		System.out.println(res);
	}
	
	public static int des_menu_num(int[] a) {
		int min=Integer.MAX_VALUE,idx=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				idx=i;
			}
		}
		return idx+1;
	}

}
