package Lec_04;

import java.util.Scanner;

public class pattern_inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,num=1;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*	");
				num++;
			}
			System.out.println();
		}
	}

}
