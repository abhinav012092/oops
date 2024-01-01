package lec_11;
import java.util.*;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 40, 30, 20, 10};
		
		System.out.println(Arrays.toString(arr));
		//bubble(arr);
		selection(arr);
		//System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int[] arr) {
		for(int cnt=0;cnt<=arr.length-1;cnt++) {
			for(int s=0;s<arr.length-1-cnt;s++) {
				if(arr[s]>arr[s+1]) {
					int temp = arr[s];
					arr[s]=arr[s+1];
					arr[s+1]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void selection(int[] arr) {
		for(int last = arr.length-1; last>=1;last--) {
		//read all elements from 0 to last
		//find the max ele idx and swap it with last
			int max_idx=0;
			for(int i=0; i<=last;i++) {
				if(arr[i]>arr[max_idx]) {
					max_idx=i;
				}
			}
			//swap
			int temp = arr[last];
			arr[last]=arr[max_idx];
			arr[max_idx]=temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
