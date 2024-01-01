package lec_09;
import java.util.*;
import java.io.*;

public class first_and_last_index_of_repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int data = sc.nextInt();
		int lo=0,hi=arr.length-1,fi=-1,li=-1;
		
		while(lo<=hi) {
			int mid= (lo+hi)/2;
			if(data<arr[mid]) {
				hi=mid-1;
			} else if(data>arr[mid]) {
				lo=mid+1;
			} else {
				fi=mid;
				hi=mid-1;
			}
		}
		System.out.println("first index = "+fi);
		
		lo=0;
		hi=arr.length-1;
		li=-1;
		while(lo<=hi) {
			int mid= (lo+hi)/2;
			if(data<arr[mid]) {
				hi=mid-1;
			} else if(data>arr[mid]) {
				lo=mid+1;
			} else {
				li=mid;
				lo=mid+1;
			}
		}
		System.out.println("last index = "+li);
	}

}
