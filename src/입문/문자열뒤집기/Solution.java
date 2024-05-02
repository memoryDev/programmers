package 입문.문자열뒤집기;

public class Solution {
    public String solution(String my_string) {
        String answer = "";

        int size = my_string.length() - 1;
        char[] arr = my_string.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            answer += arr[i];
        }

        return answer;
    }
}
