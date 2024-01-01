package oops1;

public class PC_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj1 = new P();
		//System.out.println(obj);
		C obj2 = new C();
		System.out.println(obj2);
		System.out.println(obj2.datac);
		System.out.println(obj2.data);
		P obj3 = new C();
		System.out.println(obj3);
		System.out.println(obj3.datap);
		System.out.println(obj3.data);
		System.out.println(((C)obj3).data);
		((C)obj3).func();
	}

}
