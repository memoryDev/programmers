package 입문.배열_회전_시키기;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if ("left".equals(direction)) {
            int temp = numbers[0];
            System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
            answer[numbers.length - 1] = temp;
        } else {
            int temp = numbers[numbers.length - 1];
            System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            answer[0] = temp;
        }

        return answer;
    }
}
