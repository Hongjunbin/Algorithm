import java.util.*;

public class Solution {
    public int solution(int n) {
        
        char[] arr = (String.valueOf(n)).toCharArray();
        
        int answer = 0;
        for(char a : arr) {
            answer += Integer.parseInt(String.valueOf(a));
        }
        
        return answer;
    }
}