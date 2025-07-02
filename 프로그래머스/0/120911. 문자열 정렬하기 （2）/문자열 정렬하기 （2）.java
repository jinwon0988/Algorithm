import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] A = my_string.toCharArray();
        for(int i=0; i<A.length; i++) {
            if(A[i] >= 'A' && A[i] <= 'Z') A[i] = (char)(A[i] - 'A' + 'a');
        }
        Arrays.sort(A);
        String answer = String.valueOf(A);
        return answer;
    }
}