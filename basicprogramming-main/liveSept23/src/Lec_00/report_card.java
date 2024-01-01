//import java.util.Scanner;
package Lec_00;
import java.util.Scanner;
public class report_card {
	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if(score > 90) {
			System.out.println("A grade");
		} else if(score > 80 && score < 90) {
			System.out.println("B grade");
		} else if(score > 70 && score < 80) {
			System.out.println("C grade");
		} else if(score > 60 && score < 70) {
			System.out.println("D grade");
		} else if(score < 60 && score > 50) {
			System.out.println("E grade");
		} else {
			System.out.println("F grade");
		}
	}
	
		
}
