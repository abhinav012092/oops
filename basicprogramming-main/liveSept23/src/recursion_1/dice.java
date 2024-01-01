package recursion_1;
import java.util.*;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dice(0,"",6);
		
	}
	
	public static void dice(int curr, String path, int dest) {
		if(curr==dest){
			System.out.println(path);
			return;
		}
		if(curr>dest) {
			return;
		}
		for(int step=1;step<=6;step++) {
			dice(curr+step, path+step, dest);
		}
	}

}
