package 입문._2차원으로_만들기;

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[] num_list, int n) {
        int size = num_list.length;
        int arrSize = size / n;
        int[][] answer = new int[arrSize][n];

        int idx = 0;
        for (int i = 0; i < arrSize; i++) {
            answer[i] = Arrays.copyOfRange(num_list, idx, idx + n);
            idx += n;
        }

        return answer;
    }
}
