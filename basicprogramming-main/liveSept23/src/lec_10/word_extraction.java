package lec_10;
import java.util.*;

public class word_extraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Abhinav";
	    String st="";
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)==' ' || i==str.length()-1){
	            if(i==str.length()-1){
	                st=st+str.charAt(i);
	            }
	            System.out.println(st);
	            st="";
	        }
	        else{
	            st=st+str.charAt(i);
	        }
	    }
	}
}
