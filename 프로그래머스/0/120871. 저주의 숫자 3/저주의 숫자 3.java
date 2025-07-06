class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] A = new int[101];
        int num = 1;
        int index = 1;
        while(A[100] == 0) {
            if(num % 3 != 0 && !String.valueOf(num).contains("3")) {
                A[index] = num;
                index++;
            }
            num++;
        }
        answer = A[n];
        return answer;
    }
}