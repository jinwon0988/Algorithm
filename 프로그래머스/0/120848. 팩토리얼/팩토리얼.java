class Solution {
    public int solution(int n) {
        int answer = 1, mul = 1;
        while(mul <= n) mul *= ++answer;
        return (answer-1);
    }
}