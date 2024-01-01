/*
5
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
5 * 5 * 5 * 5 * 5 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1 
 */
package pattern;
import java.util.*;

public class pattern_q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_num,total_num=1;
		while(row<=n) {
			//step1: number and stars
			cnt_num=0;
			while(cnt_num<2*row-1) {
				if(cnt_num%2==0) {
					System.out.print(row+" ");
				} else {
					System.out.print("* ");
				}
				cnt_num++;
			}
			row++;
			System.out.println();
		}
		row-=2;
		while(row>=1) {
			cnt_num=0;
			while(cnt_num<2*row-1) {
				if(cnt_num%2==0) {
					System.out.print(row+" ");
				} else {
					System.out.print("* ");
				}
				cnt_num++;
			}
			row--;
			System.out.println();
		}
	}

}
