class Solution {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int i:nums){
            if(i != val){
                array.add(i);
            }
        }
        for(int i = 0;i<array.size();i++){
            nums[i] = array.get(i);
        }
        
        return array.size();
    }
}