package lec_11;
import java.util.*;

public class sorting_bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//bubble sort outer loop till n-1
		for(int i=0;i<arr.length;i++) {
			//inner loop till n-1-i
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("ascending order");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		//descending order
		for(int i=0;i<arr.length;i++) {
			//inner loop till n-1-i
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("descending order");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}

}
