package lec_09;
import java.util.*;
import java.io.*;

public class binary_search_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int data = 7;
		
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(data>arr[mid]) {
				l=mid+1;
			} else if(data<arr[mid]) {
				h=mid-1;
			} else if(data==arr[mid]) {
				System.out.println(data+" is found at "+mid);
				return;
			}
		}
		System.out.println(-1);
		
	}

}
