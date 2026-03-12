class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff)){
                return new int[]{i,mp.get(diff)};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}