import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(n);
        while(true) {
            if(n%2==0) n /= 2;
            else n = 3*n+1;
            A.add(n);
            if(n == 1) break;
        }
        int[] answer = new int[A.size()];
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}