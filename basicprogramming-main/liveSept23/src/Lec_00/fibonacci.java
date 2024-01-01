package Lec_00;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt=1,firstnum=0,secondnum=1,sum=0;
		while(cnt<=n) {
			sum = firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			cnt++;
		}
		System.out.println("the fibonacci number from 0 to n is "+firstnum);
	}

}
