class Solution {
    public int solution(String number) {
        int answer = 0;
        while(number.length() > 1) {
            int num = Integer.parseInt(number.substring(0,2));
            num %= 9;
            number = String.valueOf(num) + number.substring(2);
        }
        if(number.charAt(0) == '9') answer = 0;
        else answer = Integer.parseInt(number);
        return answer;
    }
}