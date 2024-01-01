package assignment_recursion;
import java.util.*;

public class Chessboard_problem {
	static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		move(0,0,N,"");
		System.out.println();
		System.out.println(cnt);
	}
	
	public static void move(int r, int c, int n, String path) {
		if(r==n-1 && c==n-1) {
			System.out.print(path+"{"+r+"-"+c+"}"+" ");
			cnt++;
			return;
		}
		if(r>=n || c>=n) {
			return;
		}
		
		//knight
		move(r+2,c+1,n,path+"{"+r+"-"+c+"}K");
		move(r+1,c+2,n,path+"{"+r+"-"+c+"}K");
		
		//rook
		if(r==0||c==0||r==n-1||c==n-1) {
			for (int C = c + 1; C < n; C++) {
				move(r, C, n, path + "{" + r + "-" + c + "}R");
			}
			for (int R = r + 1; R < n; R++) {
				move(R, c, n, path + "{" + r + "-" + c + "}R");
			}
		}
		
		//Bishop
		if(r+c==n-1 || r==c) {
			int R = r+1;
			int C = c+1;
			while (R < n && C < n) {
				move(R, C, n, path + "{" + r + "-" + c + "}B");
				R++;
				C++;
			}
		}
	}

}
