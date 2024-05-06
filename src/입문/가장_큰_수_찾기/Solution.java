package 입문.가장_큰_수_찾기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Arrays.stream(array).max().getAsInt();

        answer[0] = max;
        answer[1] = Arrays.binarySearch(array, max);

        return answer;
    }
}
