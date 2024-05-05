package 입문.배열_뒤집기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int idx = num_list.length - 1;

        for (int i : num_list) {
            answer[idx--] = i;
        }

        return answer;
    }
}
