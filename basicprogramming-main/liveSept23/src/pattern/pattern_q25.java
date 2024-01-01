/*
5
        1  
      2  3  4  
    5  6  7  8  9  
  10 11 12 13 14 15 16 
17 18 19 20 21 22 23 24 25 
 */
package pattern;
import java.util.*;

public class pattern_q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_sp,total_sp=n-1,cnt_st,total_st=1,count=1;
		while(row<=n) {
			//step1: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			total_sp--;
			//step2: print count
			cnt_st=0;
			while(cnt_st<total_st) {
				if(count<10) {
					System.out.print(count+"  ");
				} else {
					System.out.print(count+" ");
				}
				cnt_st++;
				count++;
			}
			total_st+=2;
			row++;
			System.out.println();
		}
	}

}
