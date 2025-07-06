class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double s1 = (double)(dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]);
        double s2 = (double)(dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]);
        if(s1 == s2) answer = 1;
        
        s1 = (double)(dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]);
        s2 = (double)(dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0]);
        if(s1 == s2) answer = 1;
        
        s1 = (double)(dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]);
        s2 = (double)(dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]);
        if(s1 == s2) answer = 1;
        return answer;
    }
}