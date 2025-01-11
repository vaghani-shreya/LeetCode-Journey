//1 ms
class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i = 0;i< nums.length;i++){
            if(i < nums.length - 1 && nums[i] != nums[i+1]){
                array.add(nums[i]);
            }else if(i == nums.length - 1){
                 array.add(nums[i]);
            }
        }
        
        for(int i = 0;i< array.size();i++){
            nums[i] = array.get(i);
        }

        return array.size();
    }
}

//0 ms

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniquecount=1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]!= nums[uniquecount - 1]){
                nums[uniquecount] = nums [i];
                uniquecount ++ ;
            }
        }
        return uniquecount ;
    }
}