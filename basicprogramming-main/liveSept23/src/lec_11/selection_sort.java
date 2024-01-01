package lec_11;
import java.util.*;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//selection sort outer loop n-1 times
		for(int i=0;i<arr.length;i++) {
			int smallest = i;
			//inner loop starting with i+1 till n-1 times
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			//swap i with smallest
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		System.out.println("ascending order");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		
		//descending order
		for(int i=0;i<arr.length;i++) {
			int largest = i;
			//inner loop starting with i+1 till n-1 times
			for(int j=i+1;j<arr.length;j++) {
				if(arr[largest]<arr[j]) {
					largest=j;
				}
			}
			//swap i with smallest
			int temp = arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
		}
		System.out.println("descending order");
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}

}
