class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String num = "";
        for(int i=0; i<numbers.length(); i++) {
            String str = numbers.substring(i, i+1);
            num += str;
            switch(num) {
            case "zero":
                answer *= 10;
                num = "";
                break;  
            case "one":
                answer *= 10;
                answer += 1;
                num = "";
                break;
            case "two":
                answer *= 10;
                answer += 2;
                num = "";
                break;
            case "three":
                answer *= 10;
                answer += 3;
                num = "";
                break;
            case "four":
                answer *= 10;
                answer += 4;
                num = "";
                break;
            case "five":
                answer *= 10;
                answer += 5;
                num = "";
                break;
            case "six":
                answer *= 10;
                answer += 6;
                num = "";
                break;
            case "seven":
                answer *= 10;
                answer += 7;
                num = "";
                break;
            case "eight":
                answer *= 10;
                answer += 8;
                num = "";
                break;
            case "nine":
                answer *= 10;
                answer += 9;
                num = "";
                break;
            }
        }
        return answer;
    }
}