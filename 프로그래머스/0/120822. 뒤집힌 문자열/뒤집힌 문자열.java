class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] str = my_string.toCharArray();
        char[] result = new char[my_string.length()];
        
        for (int i =0; i < str.length; i++) {
            result[i] = str[str.length - 1 - i];
        }
        
        answer = new String(result);
        
        return answer;
    }
}