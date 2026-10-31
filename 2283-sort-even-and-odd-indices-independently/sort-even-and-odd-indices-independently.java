class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++){
            if(i % 2 == 0){
                ans.add(nums[i]);
            }
            else{
                ans2.add(nums[i]);
            }
        }
        Collections.sort(ans);
        
        Collections.sort(ans2, Collections.reverseOrder());
        int n = nums.length;
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < n; i++){
            if(i % 2 == 0){
                arr[i] = ans.get(even++);
            }
            else{
                arr[i] = ans2.get(odd++);
            }
             
        }
    return arr;
    }
}