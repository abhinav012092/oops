/*
Given an array Arr[], Treat each element of the array as the digit and whole array as the number. Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.
If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.
Note: The replacement must be in-place, do not allocate extra memory.
Input Format
The First Line contains the Number of test cases T.
Next Line contains an Integer N, number of digits of the number.
Next Line contains N-space separated integers which are elements of the array 'Arr'.

Constraints
1 <= T <= 100
1 <= N <= 1000
0 <= Ai <= 9

Output Format
Print the Next Permutation for each number separated by a new Line.

Sample Input
2
3
1 2 3 
3
3 2 1

Sample Output
1 3 2
1 2 3

Explanation
Possible permutations for {1,2,3} are {1,2,3} , {1,3,2} , {2,1,3} , {2,3,1}, {3,1,2} and {3,2,1}. {1,3,2} is the immediate next permutation after {1,2,3}.
For the second testcase , {3,2,1} is the last configuration so we print the first permutation as its next permutation.
*/
package assignment_2_arrays;
import java.util.*;

public class Next_permutation {

	public static List< Integer > nextGreaterPermutation(List<Integer> A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	while(T-->0) {
    		int N = sc.nextInt();
    		int[] arr = new int[N];
    		for(int x=0;x<N;x++) {
    			arr[x]=sc.nextInt();
    		}
    		
    		ArrayList<Integer> A = new ArrayList<Integer>(arr.length);
    		for(int p : arr) {
    			A.add(p);
    		}
            List<Integer> ans = nextGreaterPermutation(A);
            System.out.println();
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            //System.out.println();
    	}
    }
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner sc = new Scanner(System.in); int T = sc.nextInt(); while(T--> 0) {
	 * int N = sc.nextInt(); ArrayList<Integer> al = new ArrayList<Integer>(N);
	 * for(int x=0;x<al.size();x++) { x=sc.nextInt(); al.add(x); } ArrayList res =
	 * new ArrayList<Integer>();
	 * 
	 * //step1: find break point int idx=-1; for(int i=al.size()-2;i>=0;i--) {
	 * if(al.get(i)<al.get(i+1)) { idx=i; break; } }
	 * 
	 * if(idx==-1) { Collections.reverse(al); display(al); }
	 * 
	 * //step2: find the next greater element and swap it with arr[idx] for(int
	 * i=al.size()-1;i>idx;i--){ if(al.get(i)>al.get(idx)) { int temp = al.get(i);
	 * al.set(i, al.get(idx)); al.set(idx, temp); break; } } //step3: reverse the
	 * right half ArrayList<Integer> sl = (ArrayList<Integer>) al.subList(idx+1, N);
	 * Collections.reverse(sl); display(al); } }
	 * 
	 * public static void display(ArrayList<Integer> al) { for(int i : al) {
	 * System.out.print(i+" "); } System.out.println(); }
	 */

}
