import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int minCha = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++) {
            int cha = 0;
            if(array[i] > n) cha = array[i] - n;
            else cha = n - array[i];
            if(minCha > cha) {
                minCha = cha;
                answer = array[i];
            }
        }
        return answer;
    }
}