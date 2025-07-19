class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer;
        if(n == 1) {
            answer = new int[slicer[1]+1];
            for(int i=0; i<answer.length; i++) {
                answer[i] = num_list[i];
            }
        }else if(n == 2) {
            answer = new int[num_list.length-slicer[0]];
            for(int i=0; i<answer.length; i++) {
                answer[i] = num_list[i+slicer[0]];
            }
        }else if(n == 3) {
            answer = new int[slicer[1]-slicer[0]+1];
            for(int i=0; i<answer.length; i++) {
                answer[i] = num_list[i+slicer[0]];
            }
        }else {
            answer = new int[(slicer[1]-slicer[0])/2+1];
            for(int i=0, j=slicer[0]; i<answer.length; i++, j+=slicer[2]) {
                answer[i] = num_list[j];
            }
        }
        return answer;
    }
}