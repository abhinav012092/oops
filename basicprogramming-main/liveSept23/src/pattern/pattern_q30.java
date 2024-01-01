/*
5
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
 */
package pattern;
import java.util.*;

public class pattern_q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=n,col;
		while(row>=1) {
			col=n;
			while(col>=1) { 
				System.out.print(col+" ");
				col--;
			}
			row--;
			System.out.println();
		}
	}

}
