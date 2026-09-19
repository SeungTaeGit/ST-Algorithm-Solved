import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) != -1 && s.indexOf(ch) == s.lastIndexOf(ch)) {
                sb.append(ch);
            }
        }    
        
        answer = sb.toString();
        
        return answer;
    }
}