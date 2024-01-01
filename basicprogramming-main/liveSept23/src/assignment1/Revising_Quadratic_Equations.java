/*
Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.
Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.
Constraints
-100 <= a, b, c <= 100

Output Format
Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in non-decreasing order) separated by a space if they exist. If roots are imaginary do not print the roots. Output the integer values for the roots.

Sample Input
1 -11 28

Sample Output
Real and Distinct
4 7

Explanation
The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
 */
package assignment1;
import java.util.*;
import java.math.*;

public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - 4 * a * c;// Discriminant
		int r1, r2;
		if (d < 0)
			System.out.println("Imaginary");
		else if (d > 0) {
			System.out.println("Real and Distinct");
			r1 = ((-b - (int) (Math.sqrt(d))) / (2 * a));
			r2 = ((-b + (int) (Math.sqrt(d))) / (2 * a));
			System.out.print(r1 + " ");
			System.out.println(r2);
		} else {
			System.out.println("Real and Equal");
			r1 = (-b) / (2 * a);
			System.out.print(r1+" ");
			System.out.print(r1);
		}
	}

}
