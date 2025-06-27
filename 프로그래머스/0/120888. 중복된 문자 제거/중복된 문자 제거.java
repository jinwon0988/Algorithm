class Solution {
    public String solution(String my_string) {
        String answer = "";
        boolean[] isExisted = new boolean[123];
        for(int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if(!isExisted[ch]) {
                answer += ch;
                isExisted[ch] = true;
            }
        }
        return answer;
    }
}