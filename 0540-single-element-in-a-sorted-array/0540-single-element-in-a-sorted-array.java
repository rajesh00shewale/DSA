class Solution {
    public int singleNonDuplicate(int[] nums) {
            // Dry Run:
            // 0 1 2 3 4 5 6 7 8 
            // 1,1,2,3,3,4,4,8,8
            //     l
            //     h
            //     m
 
        int low = 0,
           high = nums.length -1;
        while( low < high){
            int mid = low + ( high - low) / 2;
            
            int rightElements = high - mid + 1,
                leftElements = mid - low + 1;    

            if( nums[mid] == nums[mid + 1]){
                if( rightElements % 2 == 1){
                    low = mid + 2;
                }else{
                    high = mid - 1;
                }

            }else if ( nums[mid -1] == nums[mid]){
                if( leftElements % 2 == 1){
                    high = mid - 2;
                }else{
                    low = mid + 1;
                }

            }else{
                return nums[mid];
            }

        }    
        return nums[low];
    }
}