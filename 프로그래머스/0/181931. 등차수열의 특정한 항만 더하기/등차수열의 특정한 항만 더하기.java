class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0, j=a; i<included.length; i++, j+=d) {
            if(included[i]) answer += j;
        }
        return answer;
    }
}