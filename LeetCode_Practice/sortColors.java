class Solution {
    public void sortColors(int[] nums) {

        int i = 0;
        int j = 0;
        int count = 0;
        int[] temp = new int[3];

        while(i<nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                count++;
                j++;
            }
            else{
                j++;
            }
            if(j == nums.length & i < nums.length){
                temp[nums[i]] = count;
                j = 0;
                count = 0;
                i++;              
            }
            
        }

        for(int k = 0;k<temp.length;k++){
             System.out.println(temp[k]);
        }       

        i = 0;
        j= 0;
        count = 0;

        while(i < temp.length){
            if(count < temp[i]){
                nums[j] = i;
                count++;
                j++;        
            }
            else{
                i++;
                count= 0;
            }
        }

        
    }
}