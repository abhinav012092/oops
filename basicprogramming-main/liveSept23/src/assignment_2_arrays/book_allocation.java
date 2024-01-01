/*
You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
Input Format
First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
Constraints
1 < t < 50
1< n < 100
1< m <= 50
1 <= Ai <= 1000
Output Format
Print the maximum number of pages that can be assigned to students.
Sample Input
1
4 2
12 34 67 90

Sample Output
113 

Explanation
1st students : 12 , 34, 67 (total = 113)
2nd students : 90 (total = 90)
Print max(113, 90)
 */
package assignment_2_arrays;
import java.util.*;

public class book_allocation {

	public static int allocatedStudents(int A[],int pages){
        int students=1,studentPages=0;
        for(int i=0;i<A.length;i++){
            if(studentPages+A[i]<=pages) studentPages+=A[i];
            else{
                students++;
                studentPages=A[i];
            }
        }
        return students;
    }
	
	public static int findPages(int[]A,int N,int M)
    {
        if(M>N) return -1;
        int minPages=Integer.MIN_VALUE,maxPages=0;
        for(int i:A){
            minPages=Math.max(minPages,i);
            maxPages+=i;
        }
        int l=minPages,r=maxPages;
        while(l<=r){
            int mid=(l+r)/2;
            int currStudents=allocatedStudents(A,mid);
            if(currStudents<=M) r=mid-1;
            else l=mid+1;
        }
        return l;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();//books
			int m = sc.nextInt();//students
			int[] pages = new int[n];
			for(int x=0;x<pages.length;x++) {
				pages[x]=sc.nextInt();
			}
		
		//int arr[] = { 12, 34, 67, 90 }; // Number of pages in books
		//int m = 2; // No. of students
			System.out.println(findPages(pages, pages.length, m));
		}
	}

}
