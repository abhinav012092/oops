/*
10
                9 0 9 
              8 9 0 9 8 
            7 8 9 0 9 8 7 
          6 7 8 9 0 9 8 7 6 
        5 6 7 8 9 0 9 8 7 6 5 
      4 5 6 7 8 9 0 9 8 7 6 5 4 
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 
 */
package pattern;
import java.util.*;

public class pattern_q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,cnt_sp,total_sp=n-1,cnt_num1=n-row,total_num1=n,cnt_num2=n,total_num2 = n-row;
		while(row<n) {
			//step1: print space
			cnt_sp=0;
			while(cnt_sp<=total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			/*if(total_sp==n-1) {
				System.out.println("0 ");
			}*/
			total_sp--;
			//step2: print num1
			cnt_num1=n-row;
			while(cnt_num1<n) {
				System.out.print(cnt_num1+" ");
				cnt_num1++;
			}
			System.out.print("0 ");
			//step3: print num2
			cnt_num2=n-1;
			while(cnt_num2>=n-row) {
				System.out.print(cnt_num2+" ");
				cnt_num2--;
			}
			row++;
			System.out.println();
		}
	}

}
