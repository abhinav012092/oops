package assignment_3_recursion;

import java.util.Scanner;

public class climb_Nth_Stair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=2;
        int i=2;
        for(i=2;i<n;i++) {
        	arr[i]=arr[i-2]+1;
        }
        System.out.println(arr[i-1]);
        //int[] ans= climbNthStairs(arr,"",n);
        //System.out.println();
        //System.out.println(cnt);
	}
	public static int[] climbNthStairs(int[] arr, int n) {
		//BP:(0,path)
		if(n==0) { //+ve BC
			arr[0]=1;
			return arr;
		}
		if(n==1) {
			arr[1]=2;
			return arr;
		}
		//if(curr>dest) { //-ve BC
			//return 0;
		//}
		for(int i=2;i<arr.length;i++) {
			arr[i]=climbNthStairs(arr[n-2],n-2)+1;
		}
		//arr[i]=arr[i-2]+1;
		//ans=climbNthStairs(arr, path+1,dest-2,ans);
		//System.out.println(arr+" "+path+" "+dest+" "+cnt);
		//ans+=climbNthStairs(arr, path+2,dest-2,ans);
		return arr;
	}
}
