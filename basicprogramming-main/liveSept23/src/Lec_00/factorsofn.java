package Lec_00;
import java.util.*;

public class factorsofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1,cnt=0;
		while(i<=n) {
			if(n%i==0) {
				cnt++;
			}
			i++;
		}
		System.out.println(n+" has "+cnt+" factors");
	}

}
