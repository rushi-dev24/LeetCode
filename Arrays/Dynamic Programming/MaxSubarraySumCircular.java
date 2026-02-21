class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //Using kadane's algorithm
        int n=nums.length,total=0,runningMax=0,runningMin=0,global=Integer.MIN_VALUE,circular=Integer.MIN_VALUE;
        int middle=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            runningMax=Math.max(nums[i],runningMax+nums[i]);
            runningMin=Math.min(nums[i],runningMin+nums[i]);
            global=Math.max(global,runningMax);
            middle=Math.min(middle,runningMin);
        }
        if(global<0) return global;
        else return Math.max(global,total-middle);
    }
}
