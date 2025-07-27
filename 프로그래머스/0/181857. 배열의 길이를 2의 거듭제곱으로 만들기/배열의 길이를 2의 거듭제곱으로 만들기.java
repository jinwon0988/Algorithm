import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while(arr.length > len) len *= 2;
        int[] answer = new int[len];
        for(int i=0; i<arr.length; i++) answer[i] = arr[i];
        answer = Arrays.copyOf(arr, len);
        return answer;
    }
}