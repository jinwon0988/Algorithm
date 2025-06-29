import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) A.add(i);
        }
        A.add(n);
        int[] answer = new int[A.size()];
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}