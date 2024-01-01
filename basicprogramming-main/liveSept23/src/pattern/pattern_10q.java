/*
5
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */
package pattern;
import java.util.*;

public class pattern_10q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_sp,total_sp=0,cnt_st,total_st=(2*n)-1;
		while(row<=n) {
			
			//print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp++;
			
			//print stars
			cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			total_st-=2;
			System.out.println();
			row++;
		}
	}

}
