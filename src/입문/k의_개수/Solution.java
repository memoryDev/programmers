package 입문.k의_개수;

public class Solution {
    public int solution(int i, int j, int k) {
        String str = "";

        for (int ii = i; ii <= j; ii++) {
            str += String.valueOf(ii);
        }

        str = str.replaceAll("[^" + String.valueOf(k) + "]", "");
        System.out.println("str = " + str);

        return str.length();
    }
}
