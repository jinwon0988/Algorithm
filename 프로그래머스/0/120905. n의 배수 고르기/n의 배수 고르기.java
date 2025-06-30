import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) A.add(numlist[i]);
        }
        int[] answer = new int[A.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}