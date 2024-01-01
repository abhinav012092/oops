package lec_10;
import java.util.*;
import java.io.*;

public class array_basic_QPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {5,2,7,4,10,8};
		//actualRec(arr);
		rotate(arr,2);
	}
	
	public static void actualRec(int[] arr) {
		int i,j,temp=0;
		for(i=0,j=arr.length-1;i<=j;i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		for(int ele : arr) {
			System.out.print(ele+"\t");
		}
	}
	
	public static void rotate(int[] arr, int r) {
		r=r%arr.length;
		for(int cnt=0; cnt<r;cnt++) {
			int temp=arr[arr.length-1];
			for(int idx=arr.length-1;idx>0;idx--) {
				arr[idx]=arr[idx-1];
			}
			arr[0]=temp;
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}
	public static void rev(int[] arr, int i, int j) {
		int temp=0;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	
	public static void rotate_2(int[] arr, int rot) {
		//step 1:
		rot = rot%arr.length;
		if(rot<0) {
			rot=rot+arr.length;
		}
		rev(arr, 0, arr.length-1);
		//step2:
		rev(arr, 0 ,rot-1);
		//step3:
		rev(arr,rot,arr.length-1);
	}

}
