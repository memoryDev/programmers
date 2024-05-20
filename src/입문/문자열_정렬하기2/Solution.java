package 입문.문자열_정렬하기2;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        String[] words = my_string.toLowerCase().split("");
        Arrays.sort(words);
        return String.join("", words);
    }
}
