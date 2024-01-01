/*
5
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
 */
package pattern;
import java.util.*;

public class pattern_q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_sp,total_sp=n-1,cnt_st,total_st=1;
		while(row<=n) {
			//step1: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			
			//step2: print cnt_st
			cnt_st=1;
			while(cnt_st<=total_st) {
				System.out.print(cnt_st+" ");
				cnt_st++;
			}
			total_st+=2;
			row++;
			System.out.println();
		}
	}

}
