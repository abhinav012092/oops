/*
7
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
 */
package pattern;
import java.util.*;

public class pattern_q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_sp,total_sp=n/2,cnt_st,total_st=1;
		while(row<=n) {
			//1. space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			//row++;
			if(row<(n/2+1)) {
				total_sp--;
			} else {
				total_sp++;
			}
			
			//2 star
			cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			if(row<(n/2+1)) {
				total_st+=2;
			} else {
				total_st-=2;
			}
			row++;
			System.out.println();
		}
			
	}

}
