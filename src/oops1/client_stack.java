package oops1;

public class client_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack S = new Stack();
		System.out.println(S.Size());
		S.add(10);
		S.add(20);
		S.add(30);
		S.print();
		System.out.println(S.pop());
		S.print();
		S.add(40);
		S.add(50);
		S.add(60);
		S.print();
	}

}
