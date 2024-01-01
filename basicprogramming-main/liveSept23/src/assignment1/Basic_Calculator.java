package assignment1;
import java.util.*;
import java.lang.*;

public class Basic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		String n1,n2;
		int res;
		do {
			ch = sc.next().charAt(0);
				//System.out.println();
			try {
				n1 = sc.next();
				int N1 = Integer.parseInt(n1);
				n2 = sc.next();
				int N2 = Integer.parseInt(n2);
			
				if(ch=='+') {
					res = (N1+N2);
					System.out.println(res);
				} else if(ch == '-') {
					res=(N1-N2);
					System.out.println(res);
				} else if(ch == '*') {
					res=(N1*N2);
					System.out.println(res);
				} else if(ch == '/') {
					res=(N1/N2);
					System.out.println(res);
				} else if(ch == '%') {
					res=(N1%N2);
					System.out.println(res);
				} else if(ch == 'X' || ch=='x') {
					System.out.println("Invalid operation. Try again.");
					break;
				} else {
					System.out.println("Invalid operation. Try again.");
				} 
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid input.Try again.");
			}
		}while(true);
				
			
		/*do {
			op = sc.next().charAt(0);
			N1 = sc.nextInt();
			N2 = sc.nextInt();
			
			switch(op) {
			case '+':
				o=(N1+N2);
				System.out.println(o);
				break;
			case '-':
				o=(N1-N2);
				System.out.println(o);
				break;
			case '*':
				o=N1*N2;
				System.out.println(o);
				break;
			case '/':
				if(N2==0) {
					System.out.println("Invalid number");
					break;
				}
				o=N1/N2;
				System.out.println(o);
				break;
			case '%':
				if(N2==0) {
					System.out.println("Invalid number");
					break;
				}
				o=(N1%N2);
				System.out.println(o);
				break;
			//case 'x':
			//case 'X':
				//break;
			default:
				System.out.println("Invalid operation.Try again");
				break;
			}
		} while(((char)op != 'x')||((char)op != 'X'));*/
		/*char ch = sc.next().charAt(0);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		switch(ch) {
		case '+':
			System.out.println(N1+N2);
			break;
		case '-':
			System.out.println(N1-N2);
			break;
		case '*':
			System.out.println(N1*N2);
			break;
		case '/':
			System.out.println(N1/N2);
			break;
		case 'x':
		case 'X':
			break;
		default:
			System.out.println("Invalid operation.Try again");
		}*/
	}
}
