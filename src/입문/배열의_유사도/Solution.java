package 입문.배열의_유사도;

import java.util.Arrays;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String s : s1) {
            answer += Arrays.asList(s2).indexOf(s) >= 0 ? 1 : 0;
        }

        return answer;
    }
}
