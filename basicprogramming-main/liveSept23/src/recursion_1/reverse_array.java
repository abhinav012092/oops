package recursion_1;
import java.util.*;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int[] arr = {10,20,30,40};
		//printrev(0,arr.length-1,arr);
		displayArr(arr,0);
	}
	
	public static void printrev(int s, int e, int[] arr) {
		if(s>e) {
			return;
		}
		System.out.print(arr[e]+" ");
		printrev(s,e-1,arr);
	}
	
	public static void displayArr(int[] arr, int idx) {
		if(idx==arr.length) {
			return;
		}
		displayArr(arr,idx+1);
		System.out.println(arr[idx]);
	}

}
