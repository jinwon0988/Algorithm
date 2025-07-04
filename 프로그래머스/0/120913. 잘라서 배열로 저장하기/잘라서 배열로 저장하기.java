class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int)(Math.ceil(my_str.length()/(double)n));
        String[] answer = new String[len];
        for(int i=0; i<len; i++) {
                answer[i] = my_str.substring(i*n, Math.min(i*n+n, my_str.length()));
        }
        return answer;
    }
}