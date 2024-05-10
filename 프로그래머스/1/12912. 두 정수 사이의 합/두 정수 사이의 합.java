class Solution {
    public long solution(int a, int b) {
        
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        
        return (long) (b + a) *(Math.abs(b-a)+1)/2;
    }
}