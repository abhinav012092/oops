package lec_09;
import java.util.*;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i,j,temp=0;
		
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0,j=arr.length-1;i<=j;i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(max+"-"+min);
		for(int ele : arr) {
			System.out.print(ele+"\t");
		}
	}

}
