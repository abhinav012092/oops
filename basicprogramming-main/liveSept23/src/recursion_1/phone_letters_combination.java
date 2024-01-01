package recursion_1;
import java.util.*;

public class phone_letters_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		lkc("29","",al,1);
	}
	public static void lkc(String buttons, String path, List<String> al,int mult) {
		//BP: "652"
		//SP: "52"
		if(buttons.isEmpty()) {
			System.out.print(path+" ");
			if(path.length()>=1) {
				al.add(path);
				//System.out.println(mult);
			}
			//al.add(path);
			return;
		}
		String sp=buttons.substring(1);
		String ops = fn(buttons.charAt(0));
		mult*=ops.length();
		for(int i=0;i<ops.length();i++) {
			lkc(sp, path+ops.charAt(i), al,mult);
		}
		//System.out.println(mult);
	}
	
	public static String fn(char ch) {
		String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return arr[ch-'0'];
	}
}
