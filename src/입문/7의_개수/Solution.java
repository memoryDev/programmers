package 입문;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(int[] array) {
        array = new int[]{7, 77, 17};
        int answer = 0;

        for (int i : array) {
            for (char c : String.valueOf(i).toCharArray()) {
                if (c == '7') answer++;
            }
        }

        return answer;
    }
}
