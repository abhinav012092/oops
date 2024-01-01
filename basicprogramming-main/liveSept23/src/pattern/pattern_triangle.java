package pattern;
import java.util.*;

public class pattern_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1,col;
		while(row<=n) {
			col=1;
			while(col<=row) {
				System.out.print("* ");
				col++;
			}
			row++;
			System.out.println();
		}
	}
}
