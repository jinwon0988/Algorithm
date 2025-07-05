import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= '0' && ch <= '9') {
                if(i > 0 && my_string.charAt(i-1) >= '0' && my_string.charAt(i-1) <= '9') {
                    A.set(A.size()-1, A.get(A.size()-1) * 10 + (ch - '0'));
                }else{
                    A.add(ch - '0');
                }
            } 
        }
        for(int i : A) {
            answer += i;
        }
        return answer;
    }
}