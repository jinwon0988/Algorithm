import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int s = 0, e = arr.length-1;
        for(int i=0; i<query.length; i++) {
            if(i % 2 == 0) {
                e = s + query[i];
            }else{
                s = s + query[i];
            }
        }
        int[] answer = new int[e-s+1];
        for(int i=s, idx=0; i<=e; i++) {
            answer[idx++] = arr[i];
        }
        return answer;
    }
}