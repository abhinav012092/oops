/*
5
*       * 
  *   *   
    *     
  *   *   
*       * 
 */
package pattern;
import java.util.*;

public class pattern_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,total_st=n;
		while(row<=n) {
			
			//step2:
			int cnt_st=0;
			while(cnt_st<total_st) {
				if(cnt_st+1==row || cnt_st+row == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}
			System.out.println();
			row++;
		}
	}

}
