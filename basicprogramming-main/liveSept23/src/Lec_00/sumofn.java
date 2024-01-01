package Lec_00;
import java.util.*;

public class sumofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("Sum of "+n+" natural numbers is "+sum);
		
	}

}
