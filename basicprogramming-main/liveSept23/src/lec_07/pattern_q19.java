package lec_07;
import java.util.*;
public class pattern_q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,cnt_st1,cnt_st2,total_st=n/2+1,cnt_sp,total_sp=-1;
		while(row<=n) {
			cnt_st1=0;
			while(cnt_st1<total_st) {
				System.out.print("* ");
				cnt_st1++;
			}
			
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
			cnt_st2=0;
			if(row==1 || row==n) {
				cnt_st2=1;
			}
			while(cnt_st2<total_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			if(row<=n/2) {
				total_st--;
				total_sp+=2;
			}else {
				total_st++;
				total_sp-=2;
			}
			row++;
			System.out.println();
		}
	}

}
