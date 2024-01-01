/*
5
        1 
      2 0 2 
    3 0 0 0 3 
  4 0 0 0 0 0 4 
5 0 0 0 0 0 0 0 5 
*/
package pattern;
import java.util.*;

public class pattern_q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1, cnt_sp,total_sp=n-1,cnt_zero, total_zero=0;
		while(row<=n) {
			//step1:print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			System.out.print(row+" ");
			cnt_zero=1;
			while(cnt_zero<total_zero) {
				System.out.print("0 ");
				cnt_zero++;
			}
			total_zero+=2;
			if(row>1) {
				System.out.print(row+" ");
			}
			row++;
			System.out.println();
		}
	}

}
