package recursion_1;

public class climb_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climbStairs(0, "",4);
		//climbStairDice(0,"",6);
	}
	
	public static void climbStairs(int curr, String path, int dest) {
		//BP:(0,path)
		if(curr==dest) { //+ve BC
			System.out.print(path+" ");
			return;
		}
		if(curr>dest) { //-ve BC
			return;
		}
		climbStairs(curr+1, path+1,dest);
		climbStairs(curr+2, path+2,dest);
		climbStairs(curr+3, path+3,dest);
	}
	
	public static void climbStairDice(int curr, String path, int dest) {
		//BP:(0,path)
		if(curr==dest) { //+ve BC
			System.out.println(path);
			return;
		}
		if(curr>dest) { //-ve BC
			return;
		}
		for(int step=1;step<=dest;step++) {
			climbStairDice(curr+step, path+step, dest);
		}
	}
}
