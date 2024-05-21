package 입문.모스부호1;

import java.util.List;

public class Solution {
    public String solution(String letter) {
        List<String> morseCode = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        StringBuilder sb = new StringBuilder();
        String[] strArr = letter.split(" ");

        for (String s : strArr) {
            int idx = morseCode.indexOf(s);
            sb.append((char)(65 + idx));
        }

        return sb.toString().toLowerCase();
    }
}
