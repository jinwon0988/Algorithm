class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int success = 0;
        int attack_count = 0;
        int cur_health = health;
        for(int time=1; time<=attacks[attacks.length-1][0]; time++) {
            success++;
            if(time == attacks[attack_count][0]) {
                cur_health -= attacks[attack_count][1];
                attack_count++;
                success = 0;
                if(cur_health <= 0) {
                    return -1;
                }
            }else{
                cur_health += bandage[1];
                if(bandage[0] == success) {
                    cur_health += bandage[2];
                    success = 0;
                }
                if(cur_health >= health) {
                    cur_health = health;
                }
            }
        }
        return cur_health;
    }
}