class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        int temp = 0;
        int len = numbers.length;
        
        switch (direction) {
            case "left" :
                temp = numbers[0];
                for (int i = 0; i < numbers.length - 1; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[len - 1] = temp;
                break;
            case "right" :
                temp = numbers[len - 1];
                for (int i = len - 1; i > 0; i--) {
                    numbers[i] = numbers[i - 1];
                }
                numbers[0] = temp;
                break;
        }
        
        return numbers;
    }
}