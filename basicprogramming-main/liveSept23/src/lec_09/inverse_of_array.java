package lec_09;
import java.util.*;
import java.io.*;

public class inverse_of_array {
	/*public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();
		
		for(int val : a) {
			sb.append(val + "\n");
		}
		System.out.println(sb);
	}
	
	public static int[] inverse(int[] a) {
		int[] inv=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			int v = a[i];
			inv[v]=i;
		}
		return inv;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		
		int[] inv = inverse(a);
		display(a);
	}*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int[] inv = inverse(arr);
		for(int element:inv) {
			System.out.println(element);
		}
	}
	
	public static int[] inverse(int[] a) {
		int[] inv=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int v = a[i];
			inv[v]=i;
		}
		return inv;
	}

}
