package 입문.암호_해독;

import java.util.Arrays;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] ch = cipher.toCharArray();

        for (int i = code - 1; i < ch.length; i+=code ) {
            answer += String.valueOf(ch[i]);
        }
        return answer;
    }
}
