import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] str = s.split(" ");
        for(int i=0; i<str.length; i++) {
            if(str[i].equals("Z") && !stack.isEmpty()) {
                stack.pop();
            }else{
                stack.add(Integer.parseInt(str[i]));
            }
        }
        int answer = 0;
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        return answer;
    }
}