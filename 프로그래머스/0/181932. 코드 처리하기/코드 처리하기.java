class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=0; i<code.length(); i++) {
            if(code.charAt(i) == '1') {
                if(mode == 0) mode = 1;
                else mode = 0;
            }
            else if(i%2 == mode) {
                answer += code.substring(i, i+1);
            }
        }
        if(answer.length() == 0) answer = "EMPTY";
        return answer;
    }
}