class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] str = rsp.toCharArray();
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '0') {
                str[i] = '5';
            } else if (str[i] == '2') {
                str[i] = '0';
            } else {
                str[i] = '2';
            }
        }
        
        answer = String.valueOf(str);
        
        return answer;
    }
}