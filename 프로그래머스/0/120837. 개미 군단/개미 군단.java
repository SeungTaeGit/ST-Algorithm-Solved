class Solution {
    public int solution(int hp) {
            int answer = 0;

            int commander = hp / 5;
            int soldier = (hp % 5) / 3;
            int worker = (hp % 5) % 3;

            answer = commander + soldier + worker;

            return answer;
        }
}