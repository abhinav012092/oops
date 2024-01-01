/*
5
        1 
      1 1 1 
    1 1 1 1 1 
  1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 
 */
package pattern;
import java.util.*;

public class pattern_q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_sp,total_sp=n-1,cnt_one,total_one=1;
		while(row<=n) {
			//step1: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			
			//step2: print stars
			cnt_one=0;
			while(cnt_one<total_one) {
				System.out.print("1 ");
				//System.out.println(row+" ");==>24Q)
				cnt_one++;
			}
			total_one+=2;
			row++;
			System.out.println();
		}
	}

}
