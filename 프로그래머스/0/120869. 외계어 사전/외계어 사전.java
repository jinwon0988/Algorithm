import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String S = "";
        for(int i=0; i<spell.length; i++) {
            S += spell[i];
        }
        for(int i=0; i<dic.length; i++) {
            if(dic[i].length() == S.length()) {
                char[] ch = dic[i].toCharArray();
                Arrays.sort(ch);
                if(String.valueOf(ch).equals(S)) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}