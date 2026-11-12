class Solution {
    public int heightChecker(int[] heights) {
        int count  = 0;
        int[] arr = new int[heights.length];
        // Arrays.sort(arr);
        int index = 0;
        for (int num : heights) {
            arr[index++] = num;
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != arr[i]){
                count++;
            }
        }
        return count;
    }
}