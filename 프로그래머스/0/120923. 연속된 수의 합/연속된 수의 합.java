class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int s = -(num / 2);
        int e = s + num - 1;
        int sum = 0;
        for(int i=s; i<s + num; i++) {
            sum += i;
        }
        while(true) {
            if(sum == total) {
                for(int i=0; i<num; i++) {
                    answer[i] = s;
                    s++;
                }
                break;
            } else {
                sum -= s;
                s++;
                e++;
                sum += e;
            }
        }
        return answer;
    }
}