package lec_08;

public class global_vars {
	static int val = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(global_vars.val);//100
		fun(20);
	}
	
	public static void fun(int a) {
		int val = 20;
		System.out.println(val);//20
		System.out.println(global_vars.val);//100
		val= val+60;//80
		global_vars.val= val+10;//90
		System.out.println(val);//80
		System.out.println(global_vars.val);//90
	}
}
