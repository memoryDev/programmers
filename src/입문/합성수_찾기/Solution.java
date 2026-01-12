package 입문.합성수_찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {

                int result = i * j;
                if (result > n) {
                    break;
                }

                set.add(result);

            }
        }

        return set.size();
    }
}
