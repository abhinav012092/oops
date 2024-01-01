package lec_07;
import java.util.*;
import java.math.*;

public class rotate_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nod=0,m=n,rot=5,i,p1,p2;
		while(m>0) {
			m/=10;
			nod++;
		}
		rot=rot%nod;
		if(rot==nod) {
			System.out.println(n);
		}
		int div = (int)Math.pow(10, rot);
		p1=n/div;
		p2=n%div;
		System.out.println(p2*(int)Math.pow(10, nod-rot)+p1);
		/*for(i=0;i<rot;i++) {	
			p1 = n/10;
			p2 = n%10;
			//System.out.println(p1+" - "+p2);
			int mult=(int)Math.pow(10, nod-1);
			n=(p2*mult)+p1;
			//System.out.println(n);
		}*/
		//System.out.println(n);
	}

}
