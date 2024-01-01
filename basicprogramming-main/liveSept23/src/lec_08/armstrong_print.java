package lec_08;

public class armstrong_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		printArm(1,n);
	}
	public static void printArm(int l, int h) {
		for(int num=l;num<=h;num++){
			if(isArmstrong(num)) {
				System.out.println(num);
			}
		}
	}
	
	public static boolean isArmstrong(int num) {
		int nod=num_digit(num),r,arm=0,backup=num;
		while(num>0) {
			r = num%10;
			arm+=(int)Math.pow(r, nod);
			num/=10;
		}
		return arm==backup;
	}
	
	public static int num_digit(int num) {
		int cnt=0;
		while(num>0) {
			cnt++;
			num/=10;
		}
		return cnt;
	}

}
