import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Node[] N = new Node[emergency.length];
        for(int i=0; i<N.length; i++) {
            N[i] = new Node(i, emergency[i]);
        }
        Arrays.sort(N, (a, b) -> Integer.compare(b.value, a.value));
        for(int i=0; i<N.length; i++) {
            N[i].emer = i + 1;
        }
        Arrays.sort(N, (a, b) -> Integer.compare(a.index, b.index));
        int[] answer = new int[N.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = N[i].emer;
        }
        return answer;
    }
    static class Node {
        int index;
        int value;
        int emer;
        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}