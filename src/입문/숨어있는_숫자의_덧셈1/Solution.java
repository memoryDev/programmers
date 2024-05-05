package 입문.숨어있는_숫자의_덧셈1;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for(char ch : my_string.replaceAll("[^0-9]", "").toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}
