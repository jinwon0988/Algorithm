class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
        while(arr.length > len) len *= 2;
        int[] answer = new int[len];
        for(int i=0; i<arr.length; i++) answer[i] = arr[i];
        for(int i=arr.length; i<len; i++) answer[i] = 0;
        return answer;
    }
}