lass Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums2.length == 0){
            nums1[0] = nums1[0];
        }
        for(int i = 0;i<n;i++){
            nums1[m+n-i-1] = nums2[i];
        }

        Arrays.sort(nums1);

    }
}