class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int cnt = 0;
        
        for (int r = 0; r < num_list.length / n; r++) {
            
            for (int c = 0; c < n; c++) {
                
                answer[r][c] = num_list[cnt];
                cnt++;
            }
        }
        
        return answer;
    }
}