import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];
            }
        });
        int end=routes[0][1];
        for(int i=1; i<routes.length; i++){
            if(end < routes[i][0]) {
                answer++;
                end = routes[i][1];
            }
        }
        return answer;
    }
}