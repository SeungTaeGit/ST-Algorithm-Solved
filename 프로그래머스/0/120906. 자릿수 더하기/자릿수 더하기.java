class Solution {
    public int solution(int n) {
        int answer = 0;
            String str = String.valueOf(n);
            int[] intarr = new int[str.length()];

            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                intarr[i] = arr[i] - '0';
            }

            for (int i = 0; i < intarr.length; i++) {
                answer += intarr[i];
            }

            return answer;
    }
}