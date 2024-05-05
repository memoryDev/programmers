package 입문.대문자와_소문자;

public class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();

        for (char c : ch) {
            answer += (int)c >= 97 ? (char)(c - 32) : (char)(c + 32);
        }

        return answer;
    }
}
