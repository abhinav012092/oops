package lec_08;
import java.util.*;

public class find_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] n2 = new int[n1];
		for(int i=0;i<n2.length;i++) {
			n2[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		int idx=-1;
		for(int i=0;i<n2.length;i++) {
			if(ele==n2[i]) {
				idx=i;
				break;
			}
		}
		System.out.println(idx);
	}

}
