package 입문.문자_반복_출력하기;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for (char c : ch) {
            for (int i = 0; i < n; i++) {
                answer += String.valueOf(c);
            }
        }

        return answer;
    }
}
