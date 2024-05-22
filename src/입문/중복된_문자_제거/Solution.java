package 입문.중복된_문자_제거;

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = my_string.split("");

        for (int i = 0; i < strArr.length; i++) {
            answer.append(answer.indexOf(strArr[i]) == -1 ? strArr[i] : "");
        }

        return answer.toString();
    }
}
