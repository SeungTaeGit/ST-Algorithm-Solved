class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] str = my_string.toCharArray();
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] != letter.charAt(0)) {
                answer += str[i];
            }
        }
        
        return answer;
    }
}