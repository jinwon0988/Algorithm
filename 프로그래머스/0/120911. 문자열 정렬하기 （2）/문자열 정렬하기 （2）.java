import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] A = my_string.toLowerCase().toCharArray();
        Arrays.sort(A);
        String answer = String.valueOf(A);
        return answer;
    }
}