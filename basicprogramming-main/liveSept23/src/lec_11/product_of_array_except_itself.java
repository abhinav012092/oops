package lec_11;
import java.util.*;

public class product_of_array_except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>1) {
			int nums[] = new int[N];
			long totalPro=1;
			for(int i=0;i<nums.length;i++) {
				int inp=sc.nextInt();
				if(inp>-10000000 && inp<=10000000) {
					nums[i]=inp;
				}
				totalPro*=nums[i];
			}
			
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==0) {
					System.out.print(totalPro+" ");
				} else {
					System.out.print(totalPro/nums[i]+" ");
				}
			}
		}
	}

}
