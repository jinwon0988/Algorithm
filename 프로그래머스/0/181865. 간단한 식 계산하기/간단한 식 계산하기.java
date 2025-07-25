class Solution {
    public int solution(String binomial) {
        String[] S = binomial.split(" ");
        int answer = 0;
        switch(S[1]){
        case "+":
            answer = Integer.parseInt(S[0]) + Integer.parseInt(S[2]);
            break;
        case "-":
            answer = Integer.parseInt(S[0]) - Integer.parseInt(S[2]);
            break;
        case "*":
            answer = Integer.parseInt(S[0]) * Integer.parseInt(S[2]);
            break;
        }
        return answer;
    }
}