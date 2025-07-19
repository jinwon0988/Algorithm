import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] answer;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) A.add(i);
        }
        if(A.size() == 0) {
            answer = new int[1];
            answer[0]=-1;
        }else{
            answer = new int[A.get(A.size()-1)-A.get(0)+1];
            for(int i=A.get(0), idx=0; i<=A.get(A.size()-1); i++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}