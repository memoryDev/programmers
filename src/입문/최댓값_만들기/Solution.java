package 입문.최댓값_만들기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        return numbers[size - 1] * numbers[size - 2];
    }
}
