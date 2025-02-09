package 입문.진료_순서_정하기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            int count = 1;

            for(int j = 0; j < emergency.length; j++) {
                if (i == j) continue;

                if(emergency[i] < emergency[j]) count++;
            }

            answer[i] = count;
        }

        return answer;

    }
}
