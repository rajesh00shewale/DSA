class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result = { -1,-1};
        int left = BinarySearch( nums, target, true);
        int right = BinarySearch( nums, target, false);
        result[0] = left;
        result[1] = right;
        return result;
    }

    static int BinarySearch( int[] nums, int target, boolean searchleft){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while( start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                index = mid;
                if (searchleft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }    
}