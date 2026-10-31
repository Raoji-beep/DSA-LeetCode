class Solution {
    public int search(int[] nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();

        int pivot = -1;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            for(int i = 0; i < nums.length; i++){
                ans.add(nums[i]);
            }
        }
        else{
            for(int i = 0; i <= pivot; i++){
                ans.add(nums[i]);
            }

            for(int i = pivot+1; i < nums.length; i++){
                ans2.add(nums[i]);
            }
        }

        for(int i = 0; i < ans.size(); i++){
            if(ans.get(i) == target){
                return i;
            }
        }

        for(int i = 0; i < ans2.size(); i++){
            if(ans2.get(i) == target){
                return ans.size() + i;
            }
        }

        return -1;
    }
}