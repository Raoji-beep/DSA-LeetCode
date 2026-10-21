class Solution {
    public boolean checkIfPangram(String sentence) {
        // if(sentence.length() != 26){
        //     return false;
        // }
        // for(char i = 'a' ; i <= 'z' ; i++){
        //     if(sentence.contains(i+"")){
        //         return true;
        //     }  
        // }
        // return false;
        String alpha = "qwertyuiopasdfghjklzxcvbnm";

        for(int i = 0 ; i < sentence.length() ; i++){
                String currentChar = sentence.charAt(i) + "";
                    alpha = alpha.replace(currentChar , "");

                    if (alpha.isEmpty()) {
                        return true;
                    }
        }
        return false;
    }
}