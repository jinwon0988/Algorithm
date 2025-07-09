class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int a=0, b=0;
        for(int i=0; i < str1.length() + str2.length(); i++) {
            if(i%2 == 0) {
                answer += str1.substring(a, a+1);
                a++;
            }else {
                answer += str2.substring(b, b+1);
                b++;
            }
        }
        return answer;
    }
}