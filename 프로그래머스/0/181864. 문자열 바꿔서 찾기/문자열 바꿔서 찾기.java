class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String S = "";
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'A') S += "B";
            else S += "A";
        }
        if(S.contains(pat)) answer = 1;
        return answer;
    }
}