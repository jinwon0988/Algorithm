class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] A = new int[31];
        for(int i=0; i<strArr.length; i++) {
            A[strArr[i].length()]++;
        }
        for(int i=0; i<A.length; i++) {
            answer = Math.max(answer, A[i]);
        }
        return answer;
    }
}