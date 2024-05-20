package 입문._369게임;

public class Solution {
    public int solution(int order) {
        int answer = 0;

        for(String s : String.valueOf(order).split("")) {
            int num = Integer.parseInt(s);
            if (num > 0 && num % 3 == 0) {
                answer++;
            }
        }

        return answer;
    }
}
