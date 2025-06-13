import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        int time = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int index = 0;
        int sum=0;
        for(int i=0; i<jobs.length; i++) {
            for(;index<jobs.length; index++) {
                if(jobs[index][0] <= time){
                    pq.add(jobs[index]);
                }else{
                    break;
                }
            }
            
            if(!pq.isEmpty()){
                int[] temp = pq.poll();
                time += temp[1];
                sum += time - temp[0];
            }else{
                time++;
                i--;
            }
        }
        return sum / jobs.length;
    }
}