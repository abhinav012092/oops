package lec_09;

public class array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,2,3,4};
		int[] a2= {23,12,14,7};
		System.out.println(a1[0]+"-" + a2[0]);
		swap(a1,a2);
		System.out.println(a1[0]+"-" +a2[0]);
	}
	
	public static void swap(int[] a, int[] b) {
		int[] c = a;
		a=b;
		b=c;
	}

}
