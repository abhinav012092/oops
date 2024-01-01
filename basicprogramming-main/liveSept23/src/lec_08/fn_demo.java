package lec_08;

public class fn_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bro!");
		fun1();
		System.out.println("Bye!");
	}
	public static void fun1() {
		System.out.println("fun1 start");
		fun2();
		System.out.println("fun1 end");
	}
	private static void fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun2 start");
		fun3();
		System.out.println("fun2 end");
	}
	private static void fun3() {
		// TODO Auto-generated method stub
		System.out.println("fun3 start");
		System.out.println("fun3 end");
	}


}
