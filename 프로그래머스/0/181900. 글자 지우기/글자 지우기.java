import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        for(int i=0, j=0; i<my_string.length(); i++) {
            if(j < indices.length && i==indices[j]) {
                j++;
            }else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}