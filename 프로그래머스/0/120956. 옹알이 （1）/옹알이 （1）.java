class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String i : babbling) {
            String s = i.replaceAll("(aya|ye|woo|ma)", "");
            if(s.equals("")) answer++;
        }
        return answer;
    }
}