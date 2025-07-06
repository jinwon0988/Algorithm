import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        AVG[] A = new AVG[score.length];
        for(int i=0; i<score.length; i++) {
            A[i] = new AVG(i, (score[i][0] + score[i][1]) / 2.0);
        }
        Arrays.sort(A, (o1, o2) -> Double.compare(o2.avg, o1.avg));
        answer[A[0].index] = 1;
        int rank = 2;
        for(int i=1; i<score.length; i++) {
            if(A[i].avg == A[i-1].avg) {
                answer[A[i].index] = answer[A[i-1].index];
                rank++;
            }else{
                answer[A[i].index] = rank++;
            }
        }
        return answer;
    }
    static class AVG {
        int index;
        double avg;
        AVG(int index, double avg) {
            this.index = index;
            this.avg = avg;
        }
    }
}