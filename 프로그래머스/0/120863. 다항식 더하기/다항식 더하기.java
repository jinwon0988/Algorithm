class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] A = polynomial.split(" [+] ");
        int a = 0;
        int b = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i].contains("x")) {
                if(A[i].length() == 1) a += 1;
                else a += Integer.parseInt(A[i].substring(0, A[i].length()-1));
            }else{
                b += Integer.parseInt(A[i]);
            }
        }
        if(a != 0 && b != 0)
            if(a == 1) answer = "x + " + String.valueOf(b);
            else answer = String.valueOf(a) + "x + " + String.valueOf(b);
        else if(a != 0 && b == 0)
            if(a == 1) answer = "x";
            else answer = String.valueOf(a) + "x";
        else
            answer = String.valueOf(b);
        return answer;
    }
}