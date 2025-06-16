class Solution {
    public int solution(int[] array) {
        int[] A = new int[1000];
        for(int i=0; i<array.length; i++) {
            A[array[i]]++;
        }
        int answer = 0;
        int max = A[0];
        for(int i=1; i<A.length; i++) {
            if(max == A[i]) {
                answer = -1;
            } else if(max < A[i]) {
                max = A[i];
                answer = i;
            }
        }
        return answer;
    }
}