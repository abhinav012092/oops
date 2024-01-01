package stack;
import java.util.*;
import java.io.*;

public class next_greater_ele_right {
	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();
		for(int val: a) {
			sb.append(val);
		}
		System.out.println(sb);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(br.readLine());
		}
		int[] nge = solve(a);
		display(nge);
	}
	
	public static int[] solve(int[] arr) {
		int[] ngr = new int[arr.length];
		Stack<Integer> st = new Stack();
		st.push(arr[arr.length-1]);
		ngr[arr.length-1]=-1;
		
		for(int i=arr.length-2;i>=0;i--) {
			while(st.size()>0 && arr[i]>=st.peek()) {
				st.pop();
			}
			if(st.size()==0) {
				ngr[i]=-1;
			}else {
				ngr[i]=st.peek();
			}
			st.push(arr[i]);
		}
		return ngr;
	}

}
