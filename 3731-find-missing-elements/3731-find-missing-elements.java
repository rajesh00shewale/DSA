class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);

    ArrayList<Integer> arr = new ArrayList<>();

    int i = 0;
    
    while (i < nums.length - 1) {
    
        int min = nums[i] + 1;
    
        while (min < nums[i + 1]) {
            arr.add(min);
            min++;
        }
    
        i++;
    }
    
    return arr;
    }
}