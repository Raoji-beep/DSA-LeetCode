class Solution {
    public boolean judgeCircle(String moves) {
        char[] letters = moves.toCharArray();
        int x =0;
        int y =0;
        for(char letter : letters){
            if(letter == 'U'){
                y++;
            }
            else if(letter == 'D'){
                y--;
            }
            else if(letter == 'L'){
                x++;
            }
            else if(letter == 'R'){
                x--;
            }
        }
        if(x == 0 && y == 0){
            return true;
        }
        return false;
    }
}