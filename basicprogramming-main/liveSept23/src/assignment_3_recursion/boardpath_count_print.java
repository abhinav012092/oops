/*
Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.
a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.
b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).
Input Format
Enter a number N (size of the board) and number M(number of the faces of a dice)
Constraints
M<=100
N<=100
M^N <=10^9

Output Format
Display the number of paths and print all the paths in a space separated manner
Sample Input
3
3

Sample Output
111 12 21 3 
4
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class boardpath_count_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = climbStairs(0,"",N,M,0,0);
        System.out.println();
        System.out.println(cnt);
	}
	
	public static int climbStairs(int curr, String path, int dest, int dice, int cnt,int ans) {
		//BP:(0,path)
		if(curr==dest) { //+ve BC
			System.out.print(path+" ");
			cnt++;
			return cnt;
		}
		if(curr>dest) { //-ve BC
			return 0;
		}
		for(int i=1;i<=dice;i++) {
			ans+=climbStairs(curr+i, path+i, dest, dice, cnt, 0);
		}
		//int a=climbStairs(curr+1, path+1,dest,dice, cnt);
		//a+=climbStairs(curr+2, path+2,dest,dice, cnt);
		return ans;
	}

}