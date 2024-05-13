package 입문.모음_제거;

public class Solution {
    public String solution(String my_string) {
        String regex = "[a|e|i|o|u]";
        return my_string.replaceAll(regex, "");
    }
}
