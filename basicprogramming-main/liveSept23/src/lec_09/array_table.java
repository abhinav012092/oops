package lec_09;
import java.util.*;
import java.io.*;
public class array_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int mult=2;
		for(int i=0;i<arr.length;i++) {
			arr[i]=mult;
			mult+=2;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
