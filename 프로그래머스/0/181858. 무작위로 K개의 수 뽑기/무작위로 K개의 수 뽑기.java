import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(!A.contains(arr[i])) A.add(arr[i]);
            if(A.size() == k) break;
        }
        int[] answer = new int[k];
        for(int i=0; i<A.size(); i++) {
            answer[i] = A.get(i);
        }
        for(int i=A.size(); i<k; i++) {
            answer[i] = -1;
        }
        return answer;
    }
}