package 입문.잘라서_배열로_저장하기;

import java.util.Arrays;

public class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil(my_str.length() / (double)n)];

        for (int i = 0 ; i < answer.length; i++) {
            if (i == answer.length - 1) {
                answer[i] = my_str.substring(i*n, my_str.length());
                break;
            }
            answer[i] = my_str.substring(i*n, (i+1)*n);
        }

        return answer;
    }
}
