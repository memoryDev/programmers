package 입문.외계행성의_나이;

import java.util.Arrays;

public class Solution {
    public String solution(int age) {
        String answer = "";

        for (char c : String.valueOf(age).toCharArray()) {
            answer += String.valueOf((char)(c + 49));
        }

        return answer;
    }
}
