import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> A = new ArrayList<>();
        for(int i=0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                A.add(strArr[i]);
            }
        }
        String[] answer = new String[A.size()];
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}