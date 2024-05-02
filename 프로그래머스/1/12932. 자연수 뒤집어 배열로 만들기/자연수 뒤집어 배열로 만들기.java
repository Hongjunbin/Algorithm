class Solution {
    public int[] solution(long n) {
        int idx = String.valueOf(n).length();
        int[] answer = new int[idx];
        
        for(int i = 0; i < idx; i++) {
            answer[i] = (int)(n % 10);
            n = n / 10;
        }
        
        
        return answer;
    }
}