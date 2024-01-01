package assignment_3_recursion;
import java.util.*;

public class subsequences_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> al =new ArrayList<String>();
        al=solve(str,"",al);
        for(int i=0;i<al.size();i++) {
        	System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println(al.size());
        //int p = str.length();
        //System.out.println();
        //System.out.print((int)(Math.pow(2, p)));
	}
	public static ArrayList<String> solve(String frens, String party, ArrayList<String> al) {
		if(frens.isEmpty()) {
			al.add(party);
			//System.out.print(party+" ");
			//System.out.println(cnt);
			return al;
		}
		
		char ch = frens.charAt(0);
		int bh = (int)(ch);
		String ah = String.valueOf(bh);
		String sp = frens.substring(1);//bcd
		solve(sp, party, al);//include
		solve(sp, party+ch,al);//exclude
		solve(sp, party+ah, al);
		return al;
	}
}
