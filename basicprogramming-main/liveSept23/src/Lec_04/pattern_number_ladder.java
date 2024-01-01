5package Lec_04;
import java.util.*;

public class pattern_number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,num=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(num+"	");
				num++;
			}
			System.out.println();
		}
	}

}
