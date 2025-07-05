class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[i][j] == 1) {
                    if(i > 0 && board[i-1][j] != 1) board[i-1][j] = 2;
                    if(i > 0 && j < board.length-1 && board[i-1][j+1] != 1) board[i-1][j+1] = 2;
                    if(j < board.length-1 && board[i][j+1] != 1) board[i][j+1] = 2;
                    if(i < board.length-1 && j < board.length-1 && board[i+1][j+1] != 1) board[i+1][j+1] = 2;
                    if(i < board.length-1 && board[i+1][j] != 1) board[i+1][j] = 2;
                    if(i < board.length-1 && j > 0 && board[i+1][j-1] != 1) board[i+1][j-1] = 2;
                    if(j > 0 && board[i][j-1] != 1) board[i][j-1] = 2;
                    if(i > 0 && j > 0 && board[i-1][j-1] != 1) board[i-1][j-1] = 2;
                }
            }
        }
        for(int[] i : board)
            for(int j : i)
                if(j == 0) answer++;
        return answer;
    }
}