class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int sum1 = 0;
        for(int i=bin1.length()-1, j=1; i>=0; i--, j*=2) {
            sum1 += (bin1.charAt(i) - '0') * j;
        }
        int sum2 = 0;
        for(int i=bin2.length()-1, j=1; i>=0; i--, j*=2) {
            sum2 += (bin2.charAt(i) - '0') * j;
        }
        int sum = sum1 + sum2;
        if(sum == 0) answer = "0";
        else
            while(sum != 0) {
                int num = sum % 2;
                answer = String.valueOf(num) + answer;
                sum /= 2;
            }
        return answer;
    }
}