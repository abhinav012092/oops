package Lec_00;
import java.util.*;

public class fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact=1,i=1;
		while(i<=n) {
			fact *=i;
			i++;
		}
		System.out.println("factorial of "+n+" is "+fact);
	}

}
