class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int mod = 0;
        if(arr.length % 2 == 0) mod = 1;
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == mod) answer[i] = arr[i] + n;
            else answer[i] = arr[i];
        }
        return answer;
    }
}