class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   
        int[] arr = new int[n];

        int i = 0;
        int start = n-k;
        while( i < n) {
            
            if (start == n) {
                start = 0;
            }
            arr[i] = nums[start];
            start++;
            i++;
        }
        for( int j = 0 ; j < n ; j++){
            nums[j] = arr[j];
        }
    }
}