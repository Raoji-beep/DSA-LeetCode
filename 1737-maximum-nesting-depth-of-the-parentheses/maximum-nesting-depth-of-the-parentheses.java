class Solution {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        int paren = 0;
        int max = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == '('){
                paren++;
                max = Math.max(max, paren);
            }
            if(arr[i] == ')'){
                paren--;
                max = Math.max(max,paren);
            }
        }
    return max;
    }
}