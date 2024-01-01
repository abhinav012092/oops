package lec_08;
import java.util.*;

public class difference_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1_size = sc.nextInt();
		int[] n1 = new int[n1_size];
		for(int i=0;i<n1.length;i++) {
			n1[i] = sc.nextInt();
		}
		
		int n2_size = sc.nextInt();
		int[] n2 = new int[n2_size];
		for(int i=0;i<n2.length;i++) {
			n2[i]= sc.nextInt();
		}

		int[] diff = new int[n1_size>n2_size? n1_size : n2_size];
		int c=0;
		
		int i=n1.length-1;
		int j=n2.length-1;
		int k=diff.length-1;
		
		while(k>=0) {
			int d=0;
			int n1val=i>=0?n1[i]: 0;
			
			if(n2[j]+c >=n1val) {
				d=n2[j]+c-n1val;
				c=0;
			} else {
				d=n2[j]+c+10-n1val;
				c=-1;
			}
			
			diff[k]=d;
			
			i--;
			j--;
			k--;
		}
		
		int idx=0;
		while(idx<diff.length) {
			if(diff[idx]==0) {
				idx++;
			} else {
				break;
			}
		}
		
		while(idx<diff.length) {
			System.out.println(diff[idx]);
			idx++;
		}
	}

}
