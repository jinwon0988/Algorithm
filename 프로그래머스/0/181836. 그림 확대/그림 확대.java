class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i=0; i<picture.length; i++) {
            answer[i*k] = "";
            for(int j=0; j<picture[i].length(); j++) {
                answer[i*k] += picture[i].substring(j,j+1).repeat(k);
            }
            for(int j=1; j<k; j++) {
                answer[i*k+j] = answer[i*k];
            }
        }
        return answer;
    }
}