class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0;
        int doublee = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 10){
                single += nums[i];
            }else{
                doublee += nums[i];
            }
        }
        if(single > doublee || doublee > single){
            return true;
        }
        return false;
    }
}