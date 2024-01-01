package lec_09;
import java.util.*;
import java.io.*;

public class ceil_and_floor_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int num = sc.nextInt();
		
		int l=0,h=arr.length-1,mid,ceil = Integer.MAX_VALUE,floor=Integer.MIN_VALUE;
		while(l<=h) {
			mid=(l+h)/2;
			if(num>arr[mid]) {
				l=mid+1;
				floor=arr[mid];
			} else if(num<arr[mid]) {
				h=mid-1;
				ceil=arr[mid];
			} else if(num==arr[mid]) {
				ceil=arr[mid];
				floor=arr[mid];
			}
		}
		System.out.println("ceil = "+ceil);
		System.out.println("floor = "+floor);
	}
	
	/*public static int ceil(int num) {
		int r = num%10;
		int ceil = num+10-r;
		return ceil;
	}
	
	public static int floor(int num) {
		int r = num%10;
		int floor = num-r;
		return floor;
	}*/

}
