package recursion_1;
import java.util.*;

public class array_firstidx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int d = sc.nextInt();//d=data
		int fi = firstIndex(arr, 0, d);
		System.out.println("first index = "+fi);
		int li = lastIndex(arr, n-1, d);
		System.out.println("last index = "+li);
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//al = alind(arr, 0, d);
		//alind(arr,0,d);
		//System.out.println(alind(arr,0,d));
	}
	public static int firstIndex(int[] arr, int idx, int x) {
		if(idx==arr.length) {
			return -1;
		}
		
		if(arr[idx]==x) {
			return idx;
		} else {
			int fiisa = firstIndex(arr, idx+1, x);
			return fiisa;//first index in small array
		}
		
	}
	public static int lastIndex(int[] arr, int idx, int y) {
		if(idx<0) {
			return -1;
		}
		if(arr[idx]==y) {
			return idx;
		} else {
			int liisa=lastIndex(arr, idx-1, y);//liisa=last index in smaller array
			return liisa;
		}
	}
	
}
