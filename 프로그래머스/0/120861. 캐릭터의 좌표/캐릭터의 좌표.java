class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int colLimit = board[0] / 2;
        int rowLimit = board[1] / 2;
        for(int i=0; i<keyinput.length; i++) {
            if(keyinput[i].equals("up") && answer[1] < rowLimit)
                answer[1]++;
            else if(keyinput[i].equals("down") && answer[1] > -rowLimit)
                answer[1]--;
            else if(keyinput[i].equals("left") && answer[0] > -colLimit)
                answer[0]--;
            else if(keyinput[i].equals("right") && answer[0] < colLimit)
                answer[0]++;
        }
        return answer;
    }
}