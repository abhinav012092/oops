/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
 */
package pattern;
import java.util.*;

public class pattern_q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_st,total_st=1,total_sp=n-1;
		while(row<=n) {
			
			//work in each loop
			//space
			int cnt_sp=1;
			while(cnt_sp<=total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
			//stars
			cnt_st=1;
			while(cnt_st<=total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			System.out.println();
			total_st++;
			total_sp--;
			row++;
		}
	}

}
