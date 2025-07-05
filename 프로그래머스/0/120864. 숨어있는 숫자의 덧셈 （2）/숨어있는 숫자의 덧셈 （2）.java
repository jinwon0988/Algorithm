class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] S = my_string.split("[^0-9]+");
        for(String i : S) {
            if(!i.isEmpty())
                answer += Integer.parseInt(i);
        }
        return answer;
    }
}