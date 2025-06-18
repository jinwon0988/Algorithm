class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=6;; i += 6) {
            if(i % n == 0) break;
            answer++;
        }
        return answer;
    }
}