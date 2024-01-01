package explicit_backtracking;
import java.util.*;
public class palindrome_partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al_bag= new ArrayList<String>();
		solve("abc","",al_bag);
	}
	
	public static void solve(String table, String bag, List<String> al_bag) {
		if(table.length()==0) {
			System.out.println(bag);
			System.out.println(al_bag);
			return;
		}
		
		//BP: table="nitin"
		for(int i=1;i<=table.length();i++) {
			String piece=table.substring(0,i);
			String remain=table.substring(i);
			//System.out.println(piece+" - "+remain);
			//al_bag.add(piece);
			//method 1
			//List<String> al_s = new ArrayList<String>(al_bag);
			//al_s.add(piece);
			//solve(remain,bag+","+piece,al_bag);
			
			//method2
			al_bag.add(piece);
			solve(remain,bag+","+piece,al_bag);
			al_bag.remove(al_bag.size()-1);
		}
	}
}
