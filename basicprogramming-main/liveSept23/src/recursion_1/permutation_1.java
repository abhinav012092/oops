package recursion_1;
import java.util.*;

public class permutation_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int r=2;
		//perm(r,n,"",new boolean[n]);
		combination(r,n,"",-1);
	}
	public static void perm(int toPick, int totalBoxes, String path,boolean[] picked) {
		if(toPick==0) {
			System.out.println(path);
			return;
		}
		for(int curr=0;curr<totalBoxes;curr++) {
			if(picked[curr]==false) {
				picked[curr]=true;
				perm(toPick-1, totalBoxes, path+"b"+curr,picked);
				picked[curr]=false;
			}
		}
	}
	
	public static void combination(int toPick, int totalBoxes, String path,int prev) {
		if(toPick==0) {
			System.out.println(path);
			return;
		}
		for(int curr=prev+1;curr<totalBoxes;curr++) {
			combination(toPick-1, totalBoxes, path+"b"+curr,curr);
		}
	}
}
