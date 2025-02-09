package 입문.점의_위치_구하기;

public class Solution {
    public int solution(int[] dot) {

        int answer = 0;

        int x = Integer.signum(dot[0]);
        int y = Integer.signum(dot[1]);

        if (x == 1 || x == 0) {
            if(y == 1) answer = 1;
            if(y == -1) answer = 4;
        } else {
            if(y == 1) answer = 2;
            if(y == -1) answer = 3;
        }
        return answer;
    }
}
