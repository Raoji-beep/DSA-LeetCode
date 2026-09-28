class Solution {
    public int maxDepth(String s) {
        char[] arr = s.toCharArray();
        int paren = 0;
        int max = 0;
        for(int i = 0; i<arr.length-1; i++){
            char ch = arr[i];
            if(ch == '('){
                paren++;
                max = Math.max(max, paren);
            }
            if(ch == ')'){
                paren--;
                max = Math.max(max,paren);
            }
        }
    return max;
    }
}