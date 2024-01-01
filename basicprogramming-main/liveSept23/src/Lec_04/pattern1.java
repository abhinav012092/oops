package Lec_04;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1;
		while(i<=5) {
			j=5;
			while(j>=i) {
				System.out.print(j);
				j--;
			}
			System.out.println();
			i++;
		}
	}

}
