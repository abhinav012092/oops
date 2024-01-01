package lec_12;
import java.util.*;

public class array_2d_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][5];
		//System.out.println(arr);
		/*System.out.println(arr.length);
		
		for(int[] row : arr) {
			System.out.println(row);
			for(int ele : row) {
				System.out.print(ele+" - ");
			}
			System.out.println();
		}*/
		int cnt=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=cnt;
				cnt++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
