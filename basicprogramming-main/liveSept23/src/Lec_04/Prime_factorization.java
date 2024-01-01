package Lec_04;
import java.util.*;

public class Prime_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=60,div=2,var=0;
		while(num>1) {
			if(num%div==0) {
				if(var==0) {
					System.out.println(div);
					var=1;
				}
			num/=div;	
			} else {
				div++;
				var=0;
			}
		}
	}

}
