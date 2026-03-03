class Solution {
    public boolean isPalindrome(String s) {
        int last = s.length()-1;
       for(int i=0;i<last;i++){
        if(!Character.isLetterOrDigit(s.charAt(i))){
            continue;
        }
        while (i < last && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
        
        if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(last))) {
                return false;
            }
        
            last--;
        }
        
       
       return true;
    }
}