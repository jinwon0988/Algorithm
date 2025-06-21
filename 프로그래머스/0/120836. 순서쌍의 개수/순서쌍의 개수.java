class Solution {
    public int solution(int n) {
        int s=1;
        int e = n;
        int answer = 0;
        while(s <= e) {
            if((s == e) && s * e == n) {
                answer += 1;
                s++;
                e--;
            }else if(s * e == n) {
                answer += 2;
                s++;
                e--;
            }else if(s * e > n) {
                e--;
            }else {
                s++;
            }
        }
        return answer;
    }
}