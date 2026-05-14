class Solution {
    public int removeDuplicates(int[] nums) {
        int p=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                nums[p++]=nums[i];
            }
        }
        return p;
    }
}