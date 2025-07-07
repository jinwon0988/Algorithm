class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int[] A = new int[10];
        for(int l = i; l<=j; l++) {
            char[] ch = String.valueOf(l).toCharArray();
            for(int m = 0; m<ch.length; m++) {
                A[ch[m] - '0']++;
            }
         }
        answer = A[k];
        return answer;
    }
}