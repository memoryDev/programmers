package 입문.자릿수_더하기;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for (String i : String.valueOf(n).split("")) {
            answer += Integer.parseInt(i);
        }
        return answer;
    }
}
