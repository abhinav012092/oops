package assignment_2_arrays;
import java.util.*;

public class form_min_from_given_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for(int i=0;i<N;i++) {
			String str = sc.next();
			arr[i]=str;
			solve(arr[i]);
		}
		//String str = sc.next();
		//solve(str);
	}
	
	public static void solve(String str) {
		int[] arr = new int[str.length()+1];
		int ans=1,cnt_D=0;
		for(int i=0;i<=str.length();i++) {
			if(i==str.length() || str.charAt(i)=='I') {
				int idx=i;
				for(int cnt=1;cnt<=cnt_D+1;cnt++) {
					arr[idx]=ans;
					idx--;
					ans++;
				}
				cnt_D=0;
			} else if (str.charAt(i)=='D') {
				cnt_D++;
			}
		}
		for(int ele: arr) {
			System.out.print(ele);
		}
	}

}
