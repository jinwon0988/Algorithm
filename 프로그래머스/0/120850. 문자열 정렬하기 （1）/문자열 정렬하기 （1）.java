import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                A.add((int)(my_string.charAt(i) - '0'));
            }
        }
        int[] answer = new int[A.size()];
        Collections.sort(A);
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}