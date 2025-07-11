import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=l; i<=r; i++) {
            String str = String.valueOf(i);
            boolean isYes = true;
            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '0' || str.charAt(j) == '5') continue;
                isYes = false;
            }
            if(isYes) A.add(Integer.parseInt(str));
        }
        int[] answer;
        if(A.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[A.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = A.get(i);
            }
        }
        return answer;
    }
}