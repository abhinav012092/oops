/*
5
        1 
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
 */
package pattern;
import java.util.*;

public class pattern_q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1, cnt_sp, total_sp=n-1,cnt_num,total_num=1;
		while(row<=n) {
			//print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			//print num
			cnt_num=row;
			while(cnt_num<total_num) {
				System.out.print(cnt_num+" ");
				cnt_num++;
			}
			total_num+=2;
			while(cnt_num>=row) {
				System.out.print(cnt_num+" ");
				cnt_num--;
			}
			row++;
			System.out.println();
		}
	}

}
