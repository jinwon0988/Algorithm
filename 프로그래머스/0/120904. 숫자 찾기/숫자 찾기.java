class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        int answer = s.indexOf(String.valueOf(k));
        if(answer != -1) answer++;
        return answer;
    }
}