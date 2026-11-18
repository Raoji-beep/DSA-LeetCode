class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    //     StringBuilder s1 = new StringBuilder(ransomNote);
    //     // StringBuilder s2 = new StringBuilder(magazine);

    //     for(int i = 0 ; i < magazine.length() ; i++){
    //         if(magazine.contains(ransomNote.charAt(i))){
    //             s1.deleteCharAt(i);
    //         }
    //     }
    //     if(s1.isEmpty()){
    //         return true;
    //     }
    // return false;
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
    char[] s1 = ransomNote.toCharArray();
    char[] s2 = magazine.toCharArray();

    Arrays.sort(s1);
    Arrays.sort(s2);
    boolean ans = true;
        int i = 0;
        int j = 0;

        while (i < s1.length && j < s2.length) {
            if (s1[i] == s2[j]) {
                i++;
            }
            j++;
        }
        return i == s1.length;
    }
}