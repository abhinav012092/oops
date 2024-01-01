/*
A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.
Input Format

There will be only one line of input:N , the number which needs to be checked.
Constraints
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)
Output Format
1 if the number is a Boston number. 0 if the number is a not Boston number.
Sample Input
378

Sample Output
1
 */
package assignment1;
import java.util.*;

public class boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P=N,i=2,sum1=0,sum2=0;
		
		while(N>0) {
			sum1 += N%10;
			N/=10;
		}
		
		while(i<=P) {
			while(P%i==0) {
				sum2=sum2+i;
				P=P/i;
			}
			i++;
		}
		
		if(sum1==sum2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}*/
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int k=N,i=2,rem, sum1=0,sum2=0;
		while(i<=N) {
			while(k>0) {
				rem=k%10;
				sum1+=rem;
				k/=10;
			}
			
			while(N%i==0) {
				N/=i;
				sum2+=i;
			}
			i++;
		}
		if(sum1==sum2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
