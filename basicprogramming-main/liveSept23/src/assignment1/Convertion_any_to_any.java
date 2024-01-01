/*
Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.
Input Format
Constraints
0 < N <= 1000000000
sb and db <= 10
Output Format

Sample Input
8
2 
33

Sample Output
11011

Explanation
All input output is as integers and in separate lines.
*/
package assignment1;
import java.util.*;

public class Convertion_any_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();//source no. base system
		int db = sc.nextInt();//dest no. base system
		int N = sc.nextInt();//no. in source format
		int dec=0,mult=1,digit;
		
		//converting from sb to decimal
		while(N>0) {
			digit=N%10;
			dec+=(digit*mult);
			mult*=sb;
			N/=10;
		}
		//System.out.println(dec);
		//converting decimal to db
		int dn=0,divisor=db,R,dividend=dec;
		mult=1;
		while(dec>0) {
			R=dividend%db;
			dn+=(R*mult);
			mult*=10;
			dec/=db;
			dividend=dec;
		}
		System.out.println(dn);
		
	}

}
