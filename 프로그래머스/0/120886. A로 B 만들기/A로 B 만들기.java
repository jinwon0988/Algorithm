class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] A = new int[26];
        int[] B = new int[26];
        for(int i=0; i<before.length(); i++) {
            A[before.charAt(i) - 'a']++;
            B[after.charAt(i) - 'a']++;
        }
        for(int i=0; i<A.length; i++) {
            if(A[i] != B[i]) answer = 0;
        }
        return answer;
    }
}