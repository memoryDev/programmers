package 입문.삼각형의_완성조건1;

import java.util.Arrays;

public class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[0] + sides[1]) ? 1 : 2;
    }
}
