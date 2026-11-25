class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0, start = 0 , end = 0;
        int min = Integer.MAX_VALUE;

        while(end <nums.length){
            sum +=nums[end];

            while(sum >= target){
                min = Math.min(min ,end-start+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(min == 2147483647){
            return 0;
        }else{
            return min;
        }
    }
}