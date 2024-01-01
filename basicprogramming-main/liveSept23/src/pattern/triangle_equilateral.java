package pattern;
import java.util.*;

public class triangle_equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,col,total_sp=n-row,total_st=row;
		while(row<=n) {
			//step1:print spaces
			int cnt_sp=0;
			while(cnt_sp<total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
			//step2:print stars
			int cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			
			System.out.println();
			row++;
			total_sp--;
			total_st+=2;
		}
	}

}
