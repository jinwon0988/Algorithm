class Solution {
    public String solution(String s) {
        String answer = "";
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++) {
            char alpha = s.charAt(i);
            count[alpha-97]++;
        }
        for(int i=0; i<count.length; i++) {
            if(count[i] == 1) answer += String.valueOf((char) (i+97));
        }
        return answer;
    }
}