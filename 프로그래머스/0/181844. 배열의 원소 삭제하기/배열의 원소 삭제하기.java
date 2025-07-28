class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len = arr.length;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    len--;
                    break;
                }
            }
        }
        int[] answer = new int[len];
        for(int i=0, idx=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}