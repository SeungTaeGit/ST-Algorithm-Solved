import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
            

            String str = my_string.replaceAll("[a-z]", "");

            char[] array = str.toCharArray();
            Arrays.sort(array);
        
            int[] answer = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                answer[i] = array[i] -'0';
            }

            return answer;
        }
}