package lec_10;
import java.util.*;

public class string_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The sky is pink";
		String[] ans = new String[4];
		for(int i=0;i<str.length();i++) {
			ans=str.split(" ");
		}
		for(int i=3;i>=0;i--) {
			System.out.println(ans[i]);
		}
	}

}
