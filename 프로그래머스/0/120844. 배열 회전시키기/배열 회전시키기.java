class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left")) {
            for(int i=0; i<numbers.length; i++) {
                answer[i] = numbers[(i+1)%numbers.length];
            }
        }else{
            for(int i=0; i<numbers.length; i++) {
                answer[(i+1)%numbers.length] = numbers[i];
            }
        }
        return answer;
    }
}