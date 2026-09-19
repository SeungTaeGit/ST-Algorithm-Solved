class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            char ch = (char) (digit + 'a');
            
            sb.append(ch);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}