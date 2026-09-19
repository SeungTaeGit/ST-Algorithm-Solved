class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        char target = (char) (k + '0');
        
        for (int num = i; num <= j; num++) {
            
            String str = String.valueOf(num);
            
            for (int x = 0; x < str.length(); x++) {
                
                if (str.charAt(x) == target) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}