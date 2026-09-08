class Solution {
    public int[] solution(int[] num_list) {
        int answerA = 0;
        int answerB = 0;
        int[] answer = new int[2];
        
        for (int i = 0; i < num_list.length; i++) {
            if ((num_list[i] % 2) == 0) {
                answerA++;
            } else {
                answerB++;
            }
        }
        
        answer[0] = answerA;
        answer[1] = answerB;
        
        return answer;
    }
}