class Solution {
    public boolean isPalindrome(String s) {
    //     int last = s.length()-1;
    //    for(int i=0;i<last;i++){
    //     if(!Character.isLetterOrDigit(s.charAt(i))){
    //         continue;
    //     }
    //     while (i < last && !Character.isLetterOrDigit(s.charAt(last))) {
    //             last--;
    //         }
        
    //     if (Character.toLowerCase(s.charAt(i)) !=
    //             Character.toLowerCase(s.charAt(last))) {
    //             return false;
    //         }
        
    //         last--;
    //     }
        
       
    //    return true;
    int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}