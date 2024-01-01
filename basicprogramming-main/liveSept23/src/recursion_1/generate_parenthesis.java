package recursion_1;
import java.util.*;

public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(3,3,"");
	}
	
	public static void solve(int op, int cl, String path) {
		if(op==0 && cl==0) {
			System.out.println(path);
			return;
		}
		if(op>cl) {
			return;
		}
		if(op>0) {
			solve(op-1, cl, path+"(");
		}
		if(cl>0) {
			solve(op, cl-1, path+")");
		}
	}
}
