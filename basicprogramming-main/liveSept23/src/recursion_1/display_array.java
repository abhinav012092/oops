package recursion_1;
import java.util.*;

public class display_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		display(0,arr);
		System.out.println();
		displayrev(arr,0);
	}
	public static void display(int idx, int[] arr) {
		if(idx==arr.length) {
			return;
		}
		System.out.print(arr[idx]+"  ");
		display(idx+1, arr);
	}
	public static void displayrev(int[] arr, int idx) {
		if(idx==arr.length) {
			return;
		}
		displayrev(arr,idx+1);
		System.out.print(arr[idx]+" ");
	}
}
