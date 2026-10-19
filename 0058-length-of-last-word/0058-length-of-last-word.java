class Solution {
    public int lengthOfLastWord(String s) {

        // if(s == null || s.trim().isEmpty()){
        //     return 0;
        String[] splash = s.split("");
        int lengths = splash.length;
        int count =0;
        // return splash.length();
        for(int i = lengths-1 ; i >= 0 ; i--){
            if(!splash[i].equals(" ")){
                count++;
                continue;
            }
            if(splash[i].equals(" ") && count != 0){
                break;
            }
         if( splash[i].equals(" ") && count == 0){
                count = 0;
                continue;
                
            }
        }
    return count;
    }
}