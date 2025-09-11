package DSA;
import java.util.*;

public class RearrangePosNeg {

    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrangeBySign(A);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    public static ArrayList<Integer> RearrangeBySign(ArrayList<Integer> A){
        int n = A.size();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, null));

        int pos = 0, neg = 1;
        for(int i = 0; i < n; i++){
            if(A.get(i) >= 0){
                ans.set(neg, A.get(i));
                neg = neg + 2;
            } else{
                ans.set(pos, A.get(i));
                pos = pos + 2;
            }
        }
        return ans;
    }

}
