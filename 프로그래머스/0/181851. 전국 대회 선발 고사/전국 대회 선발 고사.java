import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Node> A = new ArrayList<>();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                A.add(new Node(i, rank[i]));
            }
        }
        Collections.sort(A, (o1, o2) -> Integer.compare(o1.rank, o2.rank));
        int answer = A.get(0).index * 10000 + A.get(1).index * 100 + A.get(2).index;
        return answer;
    }
    
    static class Node {
        int index;
        int rank;
        public Node(int index, int rank) {
            this.index = index;
            this.rank = rank;
        }
    }
}