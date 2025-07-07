class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp = A + A;
        for(int i=0, j=A.length()-1; i<A.length(); i++, j--) {
            String str = temp.substring(i+1, i+1+A.length());
            if(str.equals(B)) {
                answer = j;
            }
        }
        return answer;
    }
}