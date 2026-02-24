class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       

        for(int  i = 1 ;i<n;i++){
            for(int j = i;j<n; j++)
            {
                int currentnumber = nums[j]+ nums[j-i];
            if(currentnumber == target)
            {
               return new int[] {j,j-i};
            }
            }
        }
         return new int []{}    ;
    }
}