import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                A.add(i);
                while(n % i == 0) n /= i;
            }
            if(n == 1) break;
        }
        int[] answer = new int[A.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = A.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}