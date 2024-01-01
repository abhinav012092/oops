package lec_10;
import java.util.*;
import java.io.*;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		find(arr, 31);
	}
	
	public static boolean find(int[] arr, int ali) {
		int s=0,e=arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid]==ali) {
				return true;
			} else if(arr[mid]<ali) {
				s=mid+1;
			} else {
				e=mid-1;
			}
		}
	}
}
