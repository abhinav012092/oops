/*
5
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 
 */
package pattern;
import java.util.*;

public class pattern_q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_st1,total_st1=1,cnt_sp,total_sp=2*n-3,cnt_st2,total_st2=1;
		while(row<=n) {
			//print star1
			cnt_st1=0;
			while(cnt_st1<total_st1) {
				System.out.print("* ");
				cnt_st1++;
			}
			total_st1++;
			
			//step 2: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp-=2;
			
			//step3: print star
			cnt_st2=0;
			while(cnt_st2<total_st2) {
				if(cnt_st2==n-1) break;
				System.out.print("* ");
				cnt_st2++;
			}
			total_st2++;
			row++;
			System.out.println();
		}
	}

}
