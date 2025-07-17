import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(num > k) {
                A.add(num);
            }
        }
        int[] answer = new int[A.size()];
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}