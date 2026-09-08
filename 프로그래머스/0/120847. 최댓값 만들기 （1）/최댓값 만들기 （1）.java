class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int secondMax = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];
            }
        }
        
        answer = max * secondMax;
        
        return answer;
    }
}