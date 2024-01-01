/*
You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Input Format
Single line contains integer n.
Constraints
1<=n<=40
Output Format
Return the number of ways to climb the top.
Sample Input
2

Sample Output
2

Explanation
Testcase 1: There are two ways to reach the top;
i) 1 step + 1 step
ii) 2 step
N=3
Testcase 2: There are three ways to reach the top i) 1 step+1 step+ 1 step
ii) 2 step+ 1 step
iii) 1 step+ 2 step
 */
package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class climb_stairs_with_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt= climbStairs(0,"",n,0);
        System.out.println();
        System.out.println(cnt);
	}
	public static int climbStairs(int curr, String path, int dest, int cnt) {
		//BP:(0,path)
		if(curr==dest) { //+ve BC
			System.out.print(path+" ");
			cnt++;
			return cnt;
		}
		if(curr>dest) { //-ve BC
			return 0;
		}
		
		int a=climbStairs(curr+1, path+1,dest,cnt);
		a+=climbStairs(curr+2, path+2,dest,cnt);
		return a;
	}
}
