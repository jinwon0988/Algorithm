class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + n%2];
        for(int i=1, j=0; i<=n; i+=2, j++) {
            answer[j] = i;
        }
        return answer;
    }
}