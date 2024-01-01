package assignment_2_arrays;
import java.util.*;
import java.math.*;

public class Maximum_Sum_Path_In_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int x=0;x<t;x++) {
			int n = sc.nextInt();
			int[] arr1 = new int[n];
			int m = sc.nextInt();
			int[] arr2 = new int[m];
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=sc.nextInt();
			}
			
			int i=0,j=0,res=0,sum1=0,sum2=0;
			while(i<arr1.length && j<arr2.length) {
				if(arr1[i]<arr2[j]) {
					sum1+=arr1[i];
					i++;
				} else if(arr1[i]>arr2[j]) {
					sum2+=arr2[j];
					j++;
				} else {
					res += Math.max(sum1, sum2) + arr1[i];
					/*
					 * System.out.println("sum1 = " + sum1); 
					 * System.out.println("sum2 = " + sum2);
					 * System.out.println("res = " + res); 
					 * System.out.println();
					 */
					sum1=0;
					sum2=0;
					i++;
					j++;
					
				}
			}
			
			while(i<arr1.length) {
				sum1+=arr1[i];
				i++;
			}
			while(j<arr2.length) {
				sum2+=arr2[j];
				j++;
			}
			res+=Math.max(sum1, sum2);
			System.out.println(res);
		}
	}

}
