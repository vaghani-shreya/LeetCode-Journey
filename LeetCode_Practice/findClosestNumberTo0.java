class Solution {
    public int findClosestNumber(int[] nums) {
        int prev = Integer.MAX_VALUE;
        int j = 0;

        for(int i = 0;i<nums.length;i++){
            int cur = Math.abs(nums[i]) - 0;

                if(cur<prev){
                    prev = cur;
                    j=nums[i];
                }else if(cur == prev){
                    j = Math.max(j,nums[i]);
                }
            
        }
        return j;
        
    }
}