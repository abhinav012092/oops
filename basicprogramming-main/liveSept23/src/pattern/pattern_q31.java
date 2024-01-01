/*
 5
5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1 
 */
package pattern;
import java.util.*;

public class pattern_q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1, col;
		while(row<=n) {
			col=n;
			while(col>=1) {
				if(row!=col) {
					System.out.print(col+" ");
				} else {
					System.out.print("* ");
				}
				col--;
			}
			row++;
			System.out.println();
		}
	}

}
