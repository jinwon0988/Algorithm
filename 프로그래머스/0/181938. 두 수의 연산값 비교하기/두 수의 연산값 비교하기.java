class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int answer = Math.max(num1, 2*a*b);
        return answer;
    }
}