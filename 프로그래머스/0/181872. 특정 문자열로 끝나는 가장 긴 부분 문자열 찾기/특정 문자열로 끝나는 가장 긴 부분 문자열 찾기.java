class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = myString.lastIndexOf(pat)+pat.length();
        answer = myString.substring(0, index);
        return answer;
    }
}