package recursion_1;

public class recursive_cointoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinToss(3,"");
	}
	
	public static void CoinToss(int n, String path) {
		//BP: CT(n)
		//SP: CT(n-1)
		if(n==0) {
			System.out.println(path);
			return;
		}
		CoinToss(n-1,path+"H");
		CoinToss(n-1,path+"T");
		
	}
}
