package lec_09;
import java.util.*;
import java.io.*;

public class subset_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		int limit = (int)Math.pow(2, arr.length);
		for(int i=0; i<limit; i++) {
			String set = "";
			int temp=i;
			for(int j=arr.length-1;j>=0;j--) {
				int r = temp%2;
				temp/=2;
				
				if(r==0) {
					set = "-\t"+set;
				} else {
					set = arr[j]+"\t"+set;
				}
			}
			System.out.println(set);
		}
	}

}
