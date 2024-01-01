package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class mazepath_D_count_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();//rows
		int N2 = sc.nextInt();//cols
		ArrayList<String> al = new ArrayList<String>();
		al = mazepath(1, 1, N1, N2);
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println(al.size());
	}
	
	public static ArrayList<String> mazepath(int sr, int sc, int dr, int dc){
		//ArrayList<String> ans = new ArrayList<String>();
		if(sr==dr && sc==dc) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> hpaths= new ArrayList<String>();
		ArrayList<String> vpaths= new ArrayList<String>();
		ArrayList<String> dpaths= new ArrayList<String>();
		if(sr<dr) {
			vpaths = mazepath(sr+1,sc,dr,dc);
		}
		if(sc<dc) {
			hpaths = mazepath(sr,sc+1,dr,dc);
		}
		if(sc<dc && sr<dr) {
			dpaths = mazepath(sr+1,sc+1,dr,dc);
		}
		
		ArrayList<String> ans = new ArrayList<String>();
		for(String vpath: vpaths) {
			ans.add("V"+vpath);
		}
		for(String hpath: hpaths) {
			ans.add("H"+hpath);
		}
		for(String dpath: dpaths) {
			ans.add("D"+dpath);
		}
		return ans;
	}

}
