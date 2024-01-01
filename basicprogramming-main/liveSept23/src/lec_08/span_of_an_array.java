package lec_08;
import java.util.*;

public class span_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] n2 = new int[n];
		int i=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(i=0;i<n2.length;i++) {
			n2[i] = sc.nextInt();
			if(n2[i]>max) {
				max=n2[i];
			} else if(n2[i]<min) {
				min=n2[i];
			}
		}
		System.out.println(max-min);
	}

}
