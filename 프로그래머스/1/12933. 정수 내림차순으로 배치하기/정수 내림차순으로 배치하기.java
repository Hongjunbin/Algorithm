import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        
        long answer = 0;
        
        String resultStr = "";
        int numIdx = String.valueOf(n).length();
        Long[] num = new Long[numIdx];
        
        for(int i = 0; i < numIdx; i++) {
            num[i] = n % 10;
            n = n / 10;
        }
        Arrays.sort(num, Collections.reverseOrder());
        for(int i = 0; i < numIdx; i++) {
            resultStr += num[i];
        }
        answer = Long.parseLong(resultStr);
        
        return answer;
    }
}