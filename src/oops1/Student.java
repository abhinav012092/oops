package oops1;

public class Student {
	String Name;
	private int Age;
	
	public Student() {
		
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int Age) {
		if(Age<0) {
			return;
			throw new RuntimeException("kaam kar");
		}
		this.Age=Age;
	}
	
	public Student(String Name, int Age) {
		this.Name=Name;
		this.Age=Age;
	}
	
	public void Intro() {
		System.out.println("==="+this);
		System.out.println("My name is "+Name+" Age is "+Age);
	}
	
	public void Party(String Name) {
		System.out.println(this.Name+" party with "+Name);
	}
}
