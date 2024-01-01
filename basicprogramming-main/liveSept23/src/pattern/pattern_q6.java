/*
5
* * * * * 
    * * * * 
        * * * 
            * * 
                * 
 */
package pattern;
import java.util.*;

public class pattern_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_sp,total_sp=1,cnt_st,total_st=1;
		while(row<=n) {
			
			//spaces
			cnt_sp=1;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp+=2;
			
			//stars
			cnt_st=n;
			while(cnt_st>=total_st) {
				System.out.print("* ");
				cnt_st--;
			}
			total_st++;
			System.out.println();
			row++;
		}

	}

}
