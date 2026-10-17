class Solution {
    public int singleNumber(int[] nums) {
        // int n = nums.length;
        // if( n == 1){
        //     return nums[0];
        // }
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = i+1 ; i < n ; j++){
        //         if(nums[i] != nums[j]){
        //             return nums[i];
        //         }
        //         // return nums[i]^nums[j];
        //     }
        // }
        // return 0;

        int result = 0;
        for(int ele : nums){
            result ^=ele;
        }
        return result;
    }
}