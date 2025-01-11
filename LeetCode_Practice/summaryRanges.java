//5 ms runtime

class Solution {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> output = new ArrayList<String>();
        String beginR = "";

        if(nums.length == 1){
            output.add(Integer.toString(nums[0]));
           return output;
        }

        for(int i = 0;i< nums.length;i++){           
            if(i == 0){
                if(nums[i] + 1 == nums[i+1]){
                    beginR = Integer.toString(nums[i]);
                }else{
                    output.add(Integer.toString(nums[i]));
                }
            }else if(i == nums.length - 1){
                if(nums[i] - 1 == nums[i-1]){
                    output.add(beginR + "->" + Integer.toString(nums[i]));
                }else{
                    output.add(Integer.toString(nums[i]));
                }
            }
            else if((nums[i - 1] == nums[i]- 1) && (nums[i]+1 == nums[i+1])){
                continue;
            }else if((nums[i - 1] == nums[i]- 1) && (nums[i]+1 != nums[i+1])){
                output.add(beginR + "->" + Integer.toString(nums[i]));
            }else if((nums[i - 1] != nums[i]- 1) && (nums[i]+1 == nums[i+1])){
                beginR = Integer.toString(nums[i]);
            }else if((nums[i - 1] != nums[i]- 1) && (nums[i]+1 != nums[i+1])){
                 output.add(Integer.toString(nums[i]));
            }
        }
       return output;
    }
}


// 1 ms runtime 

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<String>();
        int temp;
        int start = nums[0];
        List<String> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            temp = nums[i];
            if(i < nums.length-1) {
                if(nums[i+1] != temp+1){
                    addString(start, temp, result);
                    start = nums[i+1];
                }
            } else {
                addString(start, temp, result);
            }
        }
        return result;
    }

    public void addString(int start, int temp, List<String> result){
        if(start == temp){
            result.add(String.valueOf(start));
        } else {
            result.add(String.format("%d->%d", start, temp));
        }
    }
}