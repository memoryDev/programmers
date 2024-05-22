package 입문.A로_B만들기;

public class Solution {
    public int solution(String before, String after) {
        int beforeLen = 0;
        int afterLen = 0;

        for (int i = 0; i < before.length(); i++) {
            beforeLen += before.charAt(i);
            afterLen += after.charAt(i);
        }

        return beforeLen == afterLen ? 1 : 0;
    }
}
