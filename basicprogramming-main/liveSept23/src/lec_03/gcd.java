package lec_03;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30;
		int num2=42;
		
		int divisor = num1;
		int dividend=num2;
		int remainder=num2%num1;
		while(true){
			remainder=dividend%divisor;
			if(remainder==0)
				break;
			dividend=divisor;
			divisor = remainder;
		}
		System.out.println("the gcd of 30,42 is "+divisor);
	}

}
