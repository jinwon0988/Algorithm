import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        int s = numlist.length - 1;
        int e = numlist.length;
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] >= n) {
                s = i - 1;
                e = i;
                break;
            }
        }
        int index = 0;
        while(s != -1 && e != numlist.length) {
            int a = n - numlist[s];
            int b = numlist[e] - n;
            if(a >= b) {
                answer[index] = numlist[e];
                e++;
                index++;
            }else {
                answer[index] = numlist[s];
                s--;
                index++;
            }
        }
        while(s > -1) {
            answer[index] = numlist[s];
            s--;
            index++;
        }
        while(e < numlist.length) {
            answer[index] = numlist[e];
            e++;
            index++;
        }
        return answer;
    }
}