package lec_12;
import java.util.*;

public class search_in_2D_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat = {{10,20,30,40},
					{15,25,35,45},
					{27,28,37,48},
					{29,33,39,50}};
		int x = sc.nextInt();
		int i=0,j=mat[0].length-1;
		while(i<mat.length && j>=0) {
			if(x==mat[i][j]) {
				System.out.println(i);
				System.out.println(j);
				return;
			} else if(x<mat[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("not found");
	}

}
