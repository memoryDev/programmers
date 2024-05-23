package 입문.컨트롤_제트;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();
        for(String i : s.split(" ")) {
            if(i.equals("Z")) {
                stack.pop();
                continue;
            }

            stack.push(Integer.parseInt(i));
        }

        for (Integer num : stack) {
            answer += num;
        }

        return answer;


    }
}
