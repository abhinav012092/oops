package recursion_1;
import java.util.*;

public class recursion_arr_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40};
		print(0,arr.length-1, arr);
	}
	
	public static void print(int s, int e, int[] arr) {
		//BP: print(s,e,arr)
		//SP: print(s+1,e,arr)
		if(s>e) {
			return;
		}
		System.out.println(arr[s]);
		print(s+1,e,arr);
	}
	
	public static void print3(int s, int e, int[] arr) {
		if(s>e) {
			return;
		}
		int mid=(s+e)/2;
		
		print3(s,mid-1,arr);
		System.out.println(arr[mid]);
		print3(mid+1,e,arr);
	}

}
