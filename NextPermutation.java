package DSA;
import java.util.*;
public class NextPermutation {
    public static List<Integer> nextGreaterPermutation(List< Integer > A){
        int n = A.size();   // Size of the array

        // STEP 1: find the break point
        int ind = -1;
        for(int i = n-2; i >= 0; i--){
            if(A.get(i) < A.get(i+1)){
                // index i is the braekpoint
                ind = i;
                break;

            }
        }
        // if break point does not exist
        if(ind == -1){
            Collections.reverse(A);
            return A;
        }

        //   find the next greater element 
          // & Swap it with arrid[ind]

          for(int i  = n-1; i > ind; i--){
            if(A.get(i) > A.get(ind)){
                // swap
                int temp = A.get(ind);
                A.set(i, A.get(ind));
                A.set(ind, temp);
                break;
            }

          }
          // reverse the right half
          List< Integer > subList = A.subList(ind+1, n);
          Collections.reverse(subList);
          return A;
    }
    public static void main(String args[]){
        List<Integer> A = Arrays.asList(new Integer[] {2,1,5,4,3,0,0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

}

    