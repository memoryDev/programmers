package 입문.피자나눠먹기2;

public class Solution {
    public int solution(int n) {
        int pizza = 6;

        while(pizza % n != 0) pizza += 6;

        return pizza/6;
    }
}
