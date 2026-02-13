class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=first(nums,target,n);
        ans[1]=last(nums,target,n);
        return ans;
    }

    int first(int nums[],int target,int n){
        int left=0;
        int right=n-1;
        int maxEl=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target)right=mid-1;
            else left=mid+1;

            if(nums[mid]==target){
                maxEl=mid;
            }
        }
        return maxEl;
    }

     int last(int nums[],int target,int n){
        int left=0;
        int right=n-1;
        int maxEl=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>target)right=mid-1;
            else left=mid+1;

            if(nums[mid]==target){
                maxEl=mid;
            }
        }
        return maxEl;
    }

}