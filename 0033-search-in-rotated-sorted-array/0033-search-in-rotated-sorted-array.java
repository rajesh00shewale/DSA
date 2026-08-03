class Solution {
    public int search(int[] nums, int target) {

        // Dry Run:
        // t: 0
        //  0 1 2 3 4 5 6
        //  4,5,6,7,0,1,2
        //          s
        //          e
        //          m
        
        int start = 0,
            end = nums.length -1;

        while( start <= end ){
            int mid = start + ( end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if( nums[start] <= nums[mid]){
                // search in Left 

                if( target >= nums[start] && target <= nums[mid] ){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                // search in Right

                if( target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}