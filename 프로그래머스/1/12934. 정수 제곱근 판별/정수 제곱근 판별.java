class Solution {
    public long solution(long n) {
        long answer = 0;
        while(true) {
            if(answer * answer == n) {
                return (answer + 1) * (answer + 1);
            }
            if(answer * answer > n) {
                return -1;
            }
            answer++;
        }
    }
}