class Solution {
    public int[] getConcatenation(int[] nums) {
       int n= nums.length;
        int[] newArr = new int[n*2];

        for(int i = 0;i<newArr.length;i++){
            if(i<nums.length){
                newArr[i] = nums[i];
            }
            else{
                newArr[i] = nums[i-nums.length];
            }
            
        }

        return newArr;
    }
}