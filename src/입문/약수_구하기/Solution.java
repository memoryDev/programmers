package 입문.약수_구하기;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                int result = i * j;
                if (result > n) {
                    continue;
                }

                if (result == n) {
                    set.add(i);
                    set.add(j);
                    continue;
                }
            }
        }

        int index = 0;
        answer = new int[set.size()];
        for (Integer value : set) {
            answer[index++] = value;
        }

        return answer;
    }
}
