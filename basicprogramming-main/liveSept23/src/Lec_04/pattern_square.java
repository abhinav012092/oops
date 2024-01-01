package Lec_04;

public class pattern_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		for(row=0;row<=5;row++) {
			for(col=0;col<=5;col++) {
				if(row==0 || col==0 || row==5 || col==5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
