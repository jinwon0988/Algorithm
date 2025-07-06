class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] A = new int[201];
        for(int i=0; i<lines.length; i++) {
            for(int j=lines[i][0]; j<lines[i][1]; j++) {
                A[j+100] += 1;
            }
        }
        for(int i=0; i<A.length; i++) {
            if(A[i] >= 2) answer++;
        }
        return answer;
    }
}