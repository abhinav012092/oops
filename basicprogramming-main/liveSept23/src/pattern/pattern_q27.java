/*
5
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
 */
package pattern;
import java.util.*;
public class pattern_q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_sp,total_sp=n-1,cnt_num;
		while(row<=n) {
			//step1: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			
			//step 2: print num
			cnt_num=1;
			while(cnt_num<row) {
				System.out.print(cnt_num+" ");
				cnt_num++;
			}
			while(cnt_num>=1) {
				System.out.print(cnt_num+" ");
				cnt_num--;
			}
			row++;
			System.out.println();
		}
	}

}
