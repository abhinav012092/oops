package oops1;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s1 = new Student("pappu",10);
		//s1.Age=-10;
		System.out.println(s1.getAge());
		s1.setAge(-10);
		System.out.println(s1.getAge());
	}

}
