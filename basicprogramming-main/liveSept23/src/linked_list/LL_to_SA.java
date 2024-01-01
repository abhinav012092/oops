package linked_list;
import java.util.*;
import java.io.*;

public class LL_to_SA {
	
	public static class LLToStackAdapter{
		LinkedList<Integer> list;
	
		public LLToStackAdapter() {
			list = new LinkedList();
		}
		
		int size() {
			return list.size();
		}
		
		void push(int val) {
			list.addFirst(val);
		}
		
		int pop() {
			if(size()==0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return list.removeFirst();
			}
		}
		
		int top() {
			if(size()==0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return list.getFirst();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
