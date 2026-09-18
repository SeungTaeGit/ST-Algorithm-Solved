class Solution {
    public int solution(int order) {
            int answer = 0;

            String str = String.valueOf(order);

            int[] array = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i) - '0';
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0 && array[i] % 3 == 0) {
                    answer ++;
                }
            }

            return answer;
        }
}