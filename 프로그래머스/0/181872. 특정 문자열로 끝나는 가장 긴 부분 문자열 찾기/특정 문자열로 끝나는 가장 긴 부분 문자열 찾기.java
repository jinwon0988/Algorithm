class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int index = 0;
        for(int i=myString.length()-pat.length(); i>=0; i--) {
            if(myString.substring(i, i+pat.length()).equals(pat)) {
                index=i+pat.length();
                break;
            }
        }
        answer = myString.substring(0, index);
        return answer;
    }
}