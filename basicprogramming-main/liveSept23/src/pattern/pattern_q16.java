/*
5
        * * * * * 
      * * * * 
    * * * 
  * * 
* 
  * * 
    * * * 
      * * * * 
        * * * * * 
 */
package pattern;
import java.util.*;

public class pattern_q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_sp,total_sp=n-1,cnt_st,total_st=n;
		while(row<=2*n-1) {
			
			//space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			row++;
			if(row<=n) {
				total_sp--;
			}else {
				total_sp++;
			}
			
			//star
			cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			if(row<=n) {
				total_st--;
			}else {
				total_st++;
			}
			//row++;
			System.out.println();
		}
	}

}
