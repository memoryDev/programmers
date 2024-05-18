package 입문.숫자_찾기;

public class Solution {
    public int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer == -1 ? answer : answer + 1;
    }
}
