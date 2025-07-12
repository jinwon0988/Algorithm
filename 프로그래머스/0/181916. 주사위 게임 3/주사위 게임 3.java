import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] A = {a, b, c, d};
        Arrays.sort(A);
        if(A[0] == A[1] && A[1] == A[2] && A[2] == A[3]) {
            answer = 1111 * A[0];
        }else if(A[0] != A[1] && A[1] != A[2] && A[2] != A[3]) {
            answer = A[0];
        }else if(A[0] == A[1] && A[1] == A[2]) {
            answer = (10 * A[0] + A[3]) * (10 * A[0] + A[3]);
        }else if(A[1] == A[2] && A[2] == A[3]) {
            answer = (10 * A[1] + A[0]) * (10 * A[1] + A[0]);
        }else if(A[0] == A[1] && A[2] == A[3]) {
            answer = (A[0] + A[2]) * Math.abs(A[0] - A[2]);
        }else if(A[0] == A[1]) {
            answer = A[2] * A[3];
        }else if(A[1] == A[2]) {
            answer = A[0] * A[3];
        }else {
            answer = A[0] * A[1];
        }
        return answer;
    }
}