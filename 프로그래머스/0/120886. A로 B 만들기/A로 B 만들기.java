import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arrBe = before.toCharArray();
        char[] arrAf = after.toCharArray();
        
        Arrays.sort(arrBe);
        Arrays.sort(arrAf);
        
        if (Arrays.equals(arrBe, arrAf)) {
            answer = 1;
        }
        
        return answer;
    }
}