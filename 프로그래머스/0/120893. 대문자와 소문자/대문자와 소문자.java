class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(ch >= 97) answer += (char)(ch - 32);
            else answer += (char)(ch + 32);
        }
        return answer;
    }
}