package pattern;
import java.util.*;

public class pattern_q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col,cnt_st1,total_st1=(n-2)/2,cnt_sp,total_sp=1,cnt_st2,total_st2=(n-2)/2;
		while(row<=n) {
			col=1;
			while(col<=n) {
				//step1: edges with star
				if(row==1||row==n||col==1||col==n) {
					System.out.print("* ");
				} 
				col++;
			}
			//step2: print star
			cnt_st1=0;
			while(cnt_st1<total_st1) {
				System.out.print("* ");
				cnt_st1++;
			}
			if(row<=n/2+1) {
				total_st1--;
			} else {
				total_st1++;
			}
			//step3: print space
			cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			if(row<=n/2+1) {
				total_sp+=2;
			} else {
				total_sp-=2;
			}
			//step4: print star
			cnt_st2=0;
			while(cnt_st2<total_st2) {
				System.out.print("* ");
				cnt_st2++;
			}
			if(row<=n/2+1) {
				total_st2--;
			}else {
				total_st2++;
			}	
		}
		row++;
		System.out.println();
		}
}
