package lec_08;

public class array_demo1 {
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] one;
		one = new int[3];
		one[0]=10;
		one[1]=20;
		one[2]=30;
		
		//int[] two = one;
		//two[1]=200;
		swap(one, 0, 2);
		for(int i=0;i<one.length;i++) {
			System.out.println(one[i]);
		}
	}

}
