package lec_08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class reverse_an_array {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();
		
		for(int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}
	
	public static void reverse(int[] a) {
		int i,j,temp=0;
		for(i=0,j=a.length-1;i<=j;i++,j--) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		
		reverse(a);
		display(a);
	}

}
