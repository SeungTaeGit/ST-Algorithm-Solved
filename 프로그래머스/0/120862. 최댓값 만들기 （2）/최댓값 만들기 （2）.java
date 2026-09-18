import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);

            int maxA = numbers[0] * numbers[1];
            int maxB = numbers[numbers.length - 1] * numbers[numbers.length - 2];
            
            answer = Math.max(maxA, maxB);

        return answer;
    }
}