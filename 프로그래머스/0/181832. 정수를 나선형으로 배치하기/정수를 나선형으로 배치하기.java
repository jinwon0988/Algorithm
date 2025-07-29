class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int d = 0; // 0: right, 1: down, 2: left, 3: up
        int x=0, y=0;
        answer[0][0]=1;
        for(int i=2; i<=n*n; i++) {
            if(d == 0) {
                if(y+1 >= n || answer[x][y+1] != 0) {
                    d = 1;
                    i--;
                }else{
                    answer[x][++y] = i;
                }
            }else if(d == 1) {
                if(x+1 >= n || answer[x+1][y] != 0) {
                    d = 2;
                    i--;
                }else{
                    answer[++x][y] = i;
                }
            }else if(d == 2) {
                if(y-1 < 0 || answer[x][y-1] != 0) {
                    d = 3;
                    i--;
                }else{
                    answer[x][--y] = i;
                }
            }else {
                if(x-1 < 0 || answer[x-1][y] != 0) {
                    d = 0;
                    i--;
                }else{
                    answer[--x][y] = i;
                }
            }
        }
        return answer;
    }
}