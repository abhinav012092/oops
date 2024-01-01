/*
* * * * * 
* * * * 
* * * 
* * 
* 
 */
package pattern;
import java.util.*;

public class pattern_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_st,total_st=n;
		while(row<=n) {
			
			//work in each loop
			cnt_st=1;
			while(cnt_st<=total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			System.out.println();
			total_st--;
			row++;
		}
	}

}
