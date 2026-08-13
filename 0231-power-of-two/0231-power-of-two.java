class Solution {
    public boolean isPowerOfTwo(int n) {
        
        boolean ans = n > 0 && ( n & ( n - 1)) == 0;
        return ans;
    }
}