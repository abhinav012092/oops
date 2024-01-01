package lec_08;
import java.util.*;

public class sum_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] arrm = new int[m];
		for(int i=0;i<arrm.length;i++) {
			arrm[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		int[] arrn = new int[n];
		for(int i=0;i<arrn.length;i++) {
			arrn[i] = sc.nextInt();
		}
		
		int[] sum = new int[m>n? m : n];
		int c = 0;
		
		int i=arrm.length-1;
		int j=arrn.length-1;
		int k=sum.length-1;
		
		while(k>=0) {
			int d = c;
			
			if(i>=0) {
				d+=arrm[i];
			}
			if(j>=0) {
				d+=arrn[j];
			}
			c=d/10;
			d=d%10;
			
			sum[k]=d;
			
			i--;j--;k--;
		}
		if(c!=0) {
			System.out.println(c);
		}
		
		for(int val: sum) {
			System.out.println(val);
		}
	}

}
