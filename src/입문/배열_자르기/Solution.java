package 입문.배열_자르기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        System.arraycopy(numbers, num1, answer, 0, answer.length);

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
