class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] temp = video_len.split(":");
        int video_time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        temp = pos.split(":");
        int pos_time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        temp = op_start.split(":");
        int op_start_time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        temp = op_end.split(":");
        int op_end_time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
        if(pos_time >= op_start_time && pos_time <= op_end_time){
            pos_time = op_end_time;
        }
        for(int i=0; i<commands.length; i++){
            if(commands[i].equals("next")){
                pos_time += 10;
                if(pos_time > video_time) {
                    pos_time = video_time;
                }
            }else{
                pos_time -= 10;
                if(pos_time < 0){
                    pos_time = 0;
                }
            }
            if(pos_time >= op_start_time && pos_time <= op_end_time){
                pos_time = op_end_time;
            }
        }
        String answer = "";
        if((pos_time/60) < 10) {
            answer = "0" + String.valueOf(pos_time/60) + ":";
        }else{
            answer = String.valueOf(pos_time/60) + ":";
        }
        if((pos_time%60) < 10) {
            answer += "0" + String.valueOf(pos_time%60);
        }else{
            answer += String.valueOf(pos_time%60);
        }
        return answer;
    }
}