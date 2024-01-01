/*
The coding blocks members went to the success party of their first ever online boot-camp at Murthal. They ordered P number of paranthas. The stall has L cooks and each cook has a rank R. A cook with a rank R can cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 1 more parantha in 3R minutes and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. he will cook one parantha in 2 minutes one more parantha in the next 4 mins and one more in the next 6 minutes hence in total 12 minutes he cooks 3 paranthas. In 13 minutes also he can cook only 3 paranthas as he does not have enough time for the 4th parantha). Calculate the minimum time needed to cook all the paranthas.

Input Format
First line contains P, the number of pratha ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the Next line each denoting the rank of a cook.
Constraints
P <= 1000
L <= 50
1 <= R <= 8

Output Format
Print an integer which tells the number of minutes needed to get the order done.

Sample Input
10
4 
1 2 3 4

Sample Output
12

Explanation
First cook with rank 1 cooks 4 paranthas in 10 minutes (1+2+3+4).
Second cook with rank 2 cooks 3 paranthas in 12 minutes (2+4+6)
Third cook with rank 3 cooks 2 paranthas in 9 minutes (3+6) Fourth cook with rank 4 only needs to cook one last remaining parantha. He can do that in 4 minutes.
Since these cooks cook parallely, the total time taken will be the maximum of the four i.e. 12 minutes.
 */
package assignment_2_arrays;
import java.util.*;

public class Murthal_Parantha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int L = sc.nextInt();
		int[] rank = new int[L];
		for(int x=0;x<rank.length;x++) {
			rank[x]=sc.nextInt();
		}
		
		int lb=0,ub=(int)(Math.pow(10, 9)),ans=0;
		while(lb<=ub) {
			int mid=(lb+ub)/2;
			if(solve(rank,L,P,mid)) {
				ans=mid;
				ub=mid-1;
			}else {
				lb=mid+1;
			}
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
	
	public static boolean solve(int[] rank, int L, int P, int mid) {
		int time=0;
		int paratha=0;
		for(int i=0;i<L;i++) {
			time=rank[i];
			int j=2;
			while(time<=mid) {
				paratha++;
				time +=(rank[i]*j);
				j++;
			}
			if(paratha>=P) return true;
		}
		return false;
	}
}
