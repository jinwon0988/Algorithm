class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        long mul = 1;
        long sum = 0;
        for(int i=0; i<num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }
        if(mul < sum*sum) answer = 1;
        else answer = 0;
        return answer;
    }
}