class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = 0;
        if(num_list.length % n == 0) {
            len = num_list.length / n;
        }else{
            len = num_list.length / n + 1;
        }
        int[] answer = new int[len];
        for(int i=0, j=0; i<num_list.length; i+=n) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}