package 입문.짝수는싫어요;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        int size = (int)((n/2.0) + 0.5);

        int[] answer = new int[size];
        int result = 1;

        System.out.println(answer.length);

        for (int i = 0; i < answer.length; i++) {

            answer[i] = result;
            result += 2;
        }

        return answer;
    }
}
