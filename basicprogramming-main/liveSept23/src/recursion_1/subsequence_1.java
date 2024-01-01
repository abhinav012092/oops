package recursion_1;
import java.util.*;

public class subsequence_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve("abc", "");
	}
	public static void solve(String frens, String party) {
		if(frens.isEmpty()) {
			System.out.print(party+" ");
			return;
		}
		
		char ch = frens.charAt(0);
		String sp = frens.substring(1);//bcd
		solve(sp, party+ch);//include
		solve(sp, party);//exclude
		
	}
}
