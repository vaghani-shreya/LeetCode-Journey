class Solution {
    public int[] productExceptSelf(int[] nums) {

//O(N) - 4ms runtime
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 0; i< nums.length;i++){
            if(i == 0 ){
                left[i] = 1;
                right[right.length - 1] = 1;
            }else{
                left[i] = left[i - 1] * nums[i - 1];
                right[right.length - i - 1] = right[right.length - i] * nums[nums.length - i];
            }
        }

        for(int i =0;i<ans.length;i++){
             ans[i] = left[i] * right[i];
        }

        return ans;


//O(N) - 1 MS RUNTIME


        // int n = nums.length;
        // int[] result = new int[n];
        
        // int leftProduct = 1;
        // int rightProduct = 1;
        
        // // Calculate left products
        // for (int i = 0; i < n; i++) {
        //     result[i] = leftProduct;
        //     leftProduct *= nums[i];
        // }
        
        // // Calculate right products and final result
        // for (int i = n - 1; i >= 0; i--) {
        //     result[i] *= rightProduct;
        //     rightProduct *= nums[i];
        // }
        
        // return result;



//  O(N^2)   
    //     int[] temp = new int[nums.length];

    //     for(int i =0;i<nums.length;i++){
    //         int product = 1;
    //         for(int j =0;j<nums.length;j++){
    //             if(i == j){
    //                 continue;
    //             }else{
    //                 product = product * nums[j];
    //             }
    //         }
    //         temp[i] = product;
    //     }

    //     return temp;

        
        
    }
}