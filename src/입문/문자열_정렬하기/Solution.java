package 입문.문자열_정렬하기;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        String result = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[result.length()];

        for (int i = 0; i < result.length(); i++) {
            answer[i] = result.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
