package 입문.문자열_계산하기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] strArr = my_string.split(" ");
        for (int i = 0; i < strArr.length; i+=2) {
            int beforeNum = 0;
            if (i == 0) {
                answer = Integer.parseInt(strArr[i]);
            }

            if (strArr.length - 1 > i) {
                if (strArr[i + 1].equals("+")) {
                    answer += Integer.parseInt(strArr[i + 2]);
                } else {
                    answer -= Integer.parseInt(strArr[i + 2]);
                }
            }

        }

        return answer;
    }
}
