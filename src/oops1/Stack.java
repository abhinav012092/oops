package oops1;

public class Stack {
	
	private int tos;
	private int[] arr;
	
	public Stack(int cap) {
		tos = -1;
		arr = new int[cap];
	}
	
	public Stack() {
		this(5);
	}
	
	public int Size() {
		return tos++;
	}
	public int Peek() {
		if(isEmpty()) {
			throw new RuntimeException("Kya dekh rahe hon?");
		}
		return arr[tos];
	}
	
	public boolean isEmpty() {
		return tos==-1;
	}
	
	public boolean isFull() {
		return Size()==arr.length;
	}
	
	public void add(int ele) {
		if(isFull()) {
			throw new RuntimeException("kya dekh raha hon?");
		}
		tos++;
		arr[tos]=ele;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kpop");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
}