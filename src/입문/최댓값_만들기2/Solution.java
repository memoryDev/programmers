package 입문.최댓값_만들기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int n1 = numbers[0] * numbers[1];
        int n2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return n1 < n2 ? n2 : n1;
    }
}
