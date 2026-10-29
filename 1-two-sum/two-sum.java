class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     for(int i=0;i<nums.length-1;i++){
    //         for(int j = i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                  int[] result = new int [2];
    //                 result[0]=i;
    //                 result[1]=j;
    //                 return result;
    //             }
    //         }
    //     }
    //     return null;
    // }
    HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int ans = target - nums[i];

            if(map.containsKey(ans)) {
                return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    //   List<Integer> list = new ArrayList<>();

    //     for (int num : nums) {
    //         list.add(num);
    //     }

    //     for (int i = 0; i < nums.length; i++) {
    //         int required = target - nums[i];
    //         int index = list.indexOf(required);

    //         if (index != -1 && index != i) {
    //             return new int[]{i, index};
    //         }
    //     }

    //     return new int[]{};
    // }
}