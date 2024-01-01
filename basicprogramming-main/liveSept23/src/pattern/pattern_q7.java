/*
6
* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 
 */
package pattern;
import java.util.*;

public class pattern_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row=1,col;
		while(row<=n) {
			col=1;
			while(col<=n) {
				if(row==1 || row==n || col==1 || col==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
