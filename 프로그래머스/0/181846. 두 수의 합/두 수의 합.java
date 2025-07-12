class Solution {
    public String solution(String a, String b) {
        String answer = "";
        if(a.length() != b.length()) {
            if(a.length() < b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            b = "0".repeat(a.length() - b.length()) + b;
        }
        int add = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=a.length()-1; i>=0; i--) {
            int n1 = a.charAt(i) - '0';
            int n2 = b.charAt(i) - '0';
            int sum = n1 + n2 + add;
            sb.append(String.valueOf(sum % 10));
            add = sum / 10;
        }
        if(add > 0) sb.append(String.valueOf(add));
        answer = sb.reverse().toString();
        return answer;
    }
}