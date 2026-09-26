class Solution {
    public boolean canAliceWin(int[] nums) {
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <10){
                temp = temp + nums[i];
            }
            else{
                temp2 = temp2 + nums[i];
            }
        }
        if(temp > temp2 || temp < temp2){
            return true;
        }
        else{
            return false;
        }
        
    }
}