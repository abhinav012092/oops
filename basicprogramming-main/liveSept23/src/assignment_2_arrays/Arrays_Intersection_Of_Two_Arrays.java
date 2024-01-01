package assignment_2_arrays;
import java.util.*;
public class Arrays_Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int[] arr1 = new int[N];
	        for(int i=0;i<arr1.length;i++){
	            arr1[i]=sc.nextInt();
	        }
	        int[] arr2 = new int[N];
	        for(int i=0;i<arr2.length;i++){
	            arr2[i]=sc.nextInt();
	        }
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	     
	        int i=0,j=0,k=0;
	        int[] res = new int[arr1.length];
	        for(i=0;i<arr1.length;i++){
	            for(j=0;j<arr2.length;j++){
	                if(arr1[i]==arr2[j]){
	                	arr2[j]=Integer.MAX_VALUE;
	                    res[k]=arr1[i];
	                    k++;
	                    break;
	                }
	            }
	        }
	        //System.out.println(count);
	        
	        System.out.print("[");
	        for(int ele=0;ele<k;ele++){
	        	if(ele==k-1) {
	        		System.out.print(res[ele]);
	        	} else {
	        		System.out.print(res[ele]+", ");
	        	}
	        }
	        System.out.print("]");
	}

}
