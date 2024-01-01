package assignment_2_arrays;
import java.util.*;
import java.lang.*;

public class minimum_swaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int swaps=minimumSwaps(arr);
		System.out.println(swaps);
	}
	
	public static int minimumSwaps(int[] arr) {
		int swap,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				continue;
			}
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==i+1) {
					swap = arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
					count++;
					break;
				}
			}
		}
		return count;
	}
}
