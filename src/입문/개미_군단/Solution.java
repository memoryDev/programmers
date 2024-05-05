package 입문.개미_군단;

import javax.lang.model.SourceVersion;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] antAttack = {5, 3, 1};

        for (int attack : antAttack) {
            if (hp == 0) {
                break;
            }

            answer += hp / attack;
            hp %= attack;
        }

        return answer;
    }
}
