class Solution {
    public int solution(String my_string) {
        String[] S = my_string.split(" ");
        for(int i=1; i<S.length; i+=2) {
            if(S[i].equals("+")) {
                S[i+1] = String.valueOf(Integer.parseInt(S[i-1]) + Integer.parseInt(S[i+1]));
            }else if(S[i].equals("-")) {
                S[i+1] = String.valueOf(Integer.parseInt(S[i-1]) - Integer.parseInt(S[i+1]));
            }
        }
        int answer = Integer.parseInt(S[S.length-1]);
        return answer;
    }
}