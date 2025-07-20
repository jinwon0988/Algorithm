import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            A.add(arr[i]);
        }
        for(int i=0; i<query.length; i++) {
            if(i % 2 == 0) {
                for(int j=A.size()-1; j>=query[i]+1; j--) {
                    A.remove(j);
                }
            }else{
                for(int j=query[i]-1; j>=0; j--) {
                    A.remove(j);
                }
            }
        }
        int[] answer = new int[A.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = A.get(i);
        }
        return answer;
    }
}