class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        for(int i=balls, j=1; i>=balls-share+1; i--, j++) {
            answer *= i;
            answer /= j;
        }
        return (int)answer;
    }
}