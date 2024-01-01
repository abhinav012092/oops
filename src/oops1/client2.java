package oops1;

public class client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("chotu",12);
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
		}
		System.out.println("LOLO");
		int I =10;
		System.out.println(I+2);
	}

}
