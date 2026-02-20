class Solution {
    public int maxSubArray(int[] nums) {
        //Using kadanes algorith
        int n=nums.length,runningMaxSum=0,globalSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            runningMaxSum=Math.max(nums[i],runningMaxSum+nums[i]);
            globalSum=Math.max(globalSum,runningMaxSum);
        }
        return globalSum;
    }
}
