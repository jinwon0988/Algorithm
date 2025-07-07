class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1] - common[0] == common[2] - common[1]) {
            int c = common[1] - common[0];
            answer = common[common.length-1] + c;
        }else{
            int c1 = common[1] - common[0];
            int c2 = common[2] - common[1];
            int b = c2/c1;
            answer = common[common.length-1] * b;
        }
        return answer;
    }
}