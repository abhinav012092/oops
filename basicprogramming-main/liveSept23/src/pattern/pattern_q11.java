/*
5
        * 
      *   * 
    *   *   * 
  *   *   *   * 
*   *   *   *   * 
*/
package pattern;
import java.util.*;

public class pattern_q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_sp,cnt_st,total_st=row,total_sp=n-row;
		while(row<=n) {
			//print space
			//total_sp=n-row;
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			
			//print star
			cnt_st=0;
			while(cnt_st<total_st) {
				if(cnt_st%2==0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}
			total_st+=2;
			System.out.println();
			row++;
			//total_sp--;
			//total_st+=2;
		}
	}
}
