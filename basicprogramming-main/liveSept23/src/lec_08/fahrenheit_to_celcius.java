package lec_08;
import java.util.*;

public class fahrenheit_to_celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int step=20,c,f;
		for(f=0;f<=100;f=f+step) {
			c=5*(f-32)/9;
			System.out.println(f+" - "+c);
		}
	}

}
