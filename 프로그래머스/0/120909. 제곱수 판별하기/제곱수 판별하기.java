class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        if(num % 1 > 0) answer = 2;
        else answer = 1;
        return answer;
    }
}