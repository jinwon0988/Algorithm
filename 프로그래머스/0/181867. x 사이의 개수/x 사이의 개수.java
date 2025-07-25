class Solution {
    public int[] solution(String myString) {
        String[] S = myString.split("x");
        int len = S.length + ((myString.charAt(myString.length()-1)=='x') ? 1 : 0);
        int[] answer = new int[len];
        for(int i=0; i<S.length; i++) {
            answer[i] = S[i].length();
        }
        if (S.length != len) answer[len-1] = 0;
        return answer;
    }
}