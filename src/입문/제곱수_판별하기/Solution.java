package 입문.제곱수_판별하기;

public class Solution {
    public int solution(int n) {
        int num = (int)Math.sqrt((double)n);
        return num * num == n ? 1 : 2;
    }
}
