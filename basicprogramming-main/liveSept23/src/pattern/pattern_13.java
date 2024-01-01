package pattern;
import java.util.*;
public class pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,total_st=1;
		while(row<=2*n-1) {
			
			//step2
			int cnt_st=0;
			while(cnt_st<total_st) {
				System.out.print("* ");
				cnt_st++;
			}
			row++;
			if(row<=n) {
				total_st++;
			} else {
				total_st--;
			}
			System.out.println();
		}
	}

}
