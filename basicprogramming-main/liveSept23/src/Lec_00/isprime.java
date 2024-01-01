package Lec_00;
import java.util.*;
public class isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int divisor=1,count=0;
		while(divisor<=n) {
			if((n%divisor) == 0) {
				count++;
			}
			divisor++;
		}
		if(count>2) {
			System.out.println(n +" is not a prime number");
		} else {
			System.out.println(n + " is a prime number");
		}
	}

}
