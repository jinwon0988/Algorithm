import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }
        int answer = (hs.size() > nums.length/2) ? nums.length/2 : hs.size();
        return answer;
    }
}