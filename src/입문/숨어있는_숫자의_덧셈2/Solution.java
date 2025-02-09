package 입문.숨어있는_숫자의_덧셈2;

import java.util.Arrays;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String changeStr = my_string.replaceAll("[^0-9]", "_");
        String[] numArr = changeStr.split("_");
        for (String s : numArr) {
            answer += !s.equals("") ? Integer.parseInt(s) : 0;
        }

        return answer;
    }
}