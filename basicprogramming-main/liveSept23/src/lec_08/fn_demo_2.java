package lec_08;

public class fn_demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1,b=20;
		System.out.println(a+" : "+b);
		swap(a,b);
		System.out.println(a+" : "+b);//swap doesnt happen in main method
	}
	
	public static void swap(int a, int b) {
		System.out.println(a+" : "+b);
		int c = a;
		a=b;
		b=c;
		System.out.println(a+" : "+b);
	}
}
