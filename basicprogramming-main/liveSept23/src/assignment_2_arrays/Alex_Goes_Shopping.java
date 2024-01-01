package assignment_2_arrays;
import java.util.*;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] price = new int[N];
		for(int i=0;i<price.length;i++) {
			price[i]=sc.nextInt();
		}
		int q = sc.nextInt();
		for(int p=0;p<q;p++) {
			int A = sc.nextInt();
			int k = sc.nextInt();
			int choice=0;
			for(int i=0;i<price.length;i++) {
				if(price[i]<=A && A%price[i]==0) {
					choice++;
					//continue;
				}
			}
			if(choice>=k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
