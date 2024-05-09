class Solution {
    
    public boolean solution(int x) {
        
        int copy = x;
        int len = String.valueOf(x).length();
        
        int result = 0;
        for(int i = 0; i < len; i++) {
            result += x % 10;
            x = x / 10;
        }
        return copy % result == 0;
    }
}