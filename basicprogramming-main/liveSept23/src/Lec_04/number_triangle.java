package Lec_04;

public class number_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int i,j,k=1;
		for(i=1;i<=num;i++) {
			//for printing space
			for(j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			//for printing number
			for(j=1;j<=i;j++) {
				//System.out.print(i+" ");
				System.out.print(k+" ");
				k++;
			}
			//num++;
			System.out.println();
		}
	}

}
