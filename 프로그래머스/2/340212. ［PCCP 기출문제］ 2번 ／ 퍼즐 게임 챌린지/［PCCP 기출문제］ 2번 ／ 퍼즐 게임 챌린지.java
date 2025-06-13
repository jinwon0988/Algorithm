class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        long left = 1;
        long right = limit;
        while(left < right) {
            long mid = (left + right) / 2;
            
            long time = 0;
            if(diffs[0] > mid) {
                time += times[0] * (diffs[0] - mid);
            }else{
                time += times[0];
            }
            for(int i=1; i<diffs.length; i++){
                if(diffs[i] > mid){
                    time += (times[i] + times[i-1]) * (diffs[i] - mid) + times[i];
                }else{
                    time += times[i];
                }
            }
            if(time <= limit) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        
        return (int)left;
    }
}